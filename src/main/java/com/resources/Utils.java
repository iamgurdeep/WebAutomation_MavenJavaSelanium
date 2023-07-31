package com.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	public WebDriver driver;
	public static String locatorfile = ".//resources//Locators.xlsx";

	public Utils(WebDriver driver) {
		this.driver = driver;
	}

	public void getChromeSession() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://api.buildwealth.in/dashboards/login/");
	}

	public WebElement getElement(By locator) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	}

	public void switchWindowTo(String window) {
		Set<String> handles = driver.getWindowHandles();
		List<String> hlist = new ArrayList<String>(handles);
		for (String e : hlist) {
			String windowtitle = driver.switchTo().window(e).getTitle();
			if (windowtitle.contains(window)) {
				System.out.println("Window Switched to " + windowtitle);
				return;
			}
		}

	}

	public static Dictionary<String, String> getLocatorFromExcel(String pagename) throws IOException {
		Dictionary<String, String> dict = new Hashtable<String, String>();
		FileInputStream inputstream = new FileInputStream(locatorfile);
		try (XSSFWorkbook workbook = new XSSFWorkbook(inputstream)) {
			XSSFSheet sheet = workbook.getSheet(pagename);
			Iterator<Row> iterator = sheet.iterator();
			while (iterator.hasNext()) {
				XSSFRow row = (XSSFRow) iterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				String key = "";
				String value = "";
				if (row.getRowNum() > 0) {
					while (cellIterator.hasNext()) {
						XSSFCell cell = (XSSFCell) cellIterator.next();
						switch (cell.getCellType()) {
						case STRING:
							if (cell.getColumnIndex() == 0) {
								key = cell.getStringCellValue();
							} else if (cell.getColumnIndex() == 1) {
								value = cell.getStringCellValue();
							}
//					System.out.print(cell.getColumnIndex()+cell.getStringCellValue());
							break;
						default:
							break;
						}
					}
					dict.put(key, value);
				}
			}
		}
		return dict;
	}

//	public static void main(String[] args) throws IOException {
//		Dictionary<String, String> dict = getLocatorFromExcel("Login");
//		
//	}

}
