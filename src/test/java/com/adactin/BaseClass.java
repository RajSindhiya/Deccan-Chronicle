package com.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	String result="";
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public void getUrl(String url) {
		driver.get(url);
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public void elementSendkeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	public void elementClick(WebElement element) {
		element.click();
	}
	public String getappTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String getcurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
    public String getAttribute(WebElement element) {
    	String attribute = element.getAttribute("value");
    	return attribute;
    }
	
public WebElement findbyID(String text) {
	WebElement findElement = driver.findElement(By.id(text));
	return findElement;
}
	public WebElement findbyName(String text) {
		WebElement findElement = driver.findElement(By.name(text));
		return findElement;
	}

	public WebElement findbyClassName(String text) {
		WebElement findElement = driver.findElement(By.className(text));
		return findElement;
	}
	public WebElement findbyXpath(String text) {
		WebElement findElement = driver.findElement(By.xpath(text));
		return findElement;
	}
	public WebElement findbyLinkText(String text) {
		WebElement findElement = driver.findElement(By.linkText(text));
		return findElement;
	}
	public WebElement findByPartialLinkText(String text) {
		WebElement findElement = driver.findElement(By.partialLinkText(text));
		return findElement;
	}
	
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void contextClick(WebElement element) {
		Actions actions=new Actions(driver);
		actions.contextClick(element).perform();
		
	}
	public void dragandDrop (WebElement source,WebElement destination) {
		Actions actions=new Actions(driver);
	actions.dragAndDrop(source, destination).build().perform();
	}
	
	public void doubleClick(WebElement element) {
		Actions actions= new Actions(driver);
		actions.doubleClick(element).perform();
	}
	
	
	public void selectByIndex(WebElement element, int number) {
		Select select= new Select(element);
		select.selectByIndex(number);
	}
	
	public void selectByValue(WebElement element, String value) {
	Select select= new Select(element);
	select.selectByValue(value);
	}
	
	public void selectByVisibleText(WebElement element, String text) {
		Select select= new Select(element);
		select.selectByVisibleText(text);
	}
	
	public boolean isDisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	return displayed;
	}
	
	public boolean isSelected (WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	
	public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void alertSendkeys(String text) {
		Alert alert= driver.switchTo().alert();
		alert.sendKeys(text);
	}
	
	public void jsSetAttribute(WebElement element, String text) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("argument[0].setAttribute('value',"+text+"')",element);
	}
	public void jsgetAttribute(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("return arguement[0].getAttribute('value',)",element);
	
	}
	public void quitWindow() {
		driver.quit();
	}
	
	public void closeWindow() {
		driver.close();
	}
	
	public void clearText(WebElement element) {
		element.clear();
	}
	
	public void implicitWait(int time) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
	}
	 
}
