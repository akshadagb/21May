package com.projectnmae.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.projectnmae.qa.Base.TestBase;

public class Utils extends TestBase{
	//1.Drawing boarder around element

		public static void Borderbyjs(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
			
		}
		//2.Capture the title of webpage
			
		public static String titlebyjs(WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			String Title = js.executeScript("return document.title").toString();
			return Title;
		}
		//3.click on element
		public static void clickbyjs(WebDriver driver,WebElement element) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", element);
		}
		//4.create alert
		public static void alertbyjs(WebDriver driver,String Message) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("alert('"+"Message"+"')");
		}
		
		//5.refreshing page
		public static void refreshbyjs(WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
		}
		
		//6.scroll down/up
		public static void scrollbyjs(WebDriver driver,int x,int y) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("scroll("+x+","+y+")");
		}
		//7.scroll into view
		public static void scrollintoViewjs(WebDriver driver,WebElement element) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			
		}

		//ScreenShot
		public static void getScreenshot(WebDriver driver,String testname) throws IOException {
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Date d = new Date();
		 System.out.println(d);
		 
		String filename = "Registrationpage_"+d.toString().replace(" ", "_").replace(":", "_")+".jpeg";
		File destination = new File("C:\\Users\\Admin\\Desktop\\Selenium all jar files\\Screenshot\\"+filename);
		FileUtils.copyFile(scr, destination);
		}
		//Apachi poi Excel sheet utility
		public static String getStringTestData(int row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Book1a.xlsx");
			String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
			return value;
		}
}
