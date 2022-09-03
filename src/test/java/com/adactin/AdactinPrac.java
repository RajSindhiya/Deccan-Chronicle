package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinPrac extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		BaseClass B=new BaseClass();
		B.getDriver();
		B.getUrl("https://adactinhotelapp.com/");
        B.elementSendkeys(B.findbyID("username"), "Sindhiya");
		B.elementSendkeys(B.findbyID("password"), "XQSB78");
		B.elementClick(B.findbyID("login"));
		B.selectByVisibleText(B.findbyID("location"),"London");
		B.selectByVisibleText(B.findbyID("hotels"), "Hotel Sunshine");
		B.selectByVisibleText(B.findbyID("room_type"), "Double");
		B.selectByVisibleText(B.findbyID("room_nos"), "3 - Three");
		B.clearText(B.findbyID("datepick_in"));
		B.elementSendkeys(B.findbyID("datepick_in"), "30/08/2022");
		B.clearText(B.findbyID("datepick_out"));
		B.elementSendkeys(B.findbyID("datepick_out"), "31/08/2022");
		B.selectByVisibleText(B.findbyID("adult_room"), "2 - Two");
		B.selectByVisibleText(B.findbyID("child_room"), "2 - Two");
		B.elementClick(B.findbyID("Submit"));
		B.elementClick(B.findbyID("radiobutton_0"));
		B.elementClick(B.findbyID("continue"));
		B.elementSendkeys(B.findbyID("first_name"), "Sindhiya");
		B.elementSendkeys(B.findbyID("last_name"), "Samuel");
		B.elementSendkeys(B.findbyID("address"), "Chennai");
		B.elementSendkeys(B.findbyID("cc_num"), "1234567890123456");
		B.selectByVisibleText(B.findbyID("cc_type"), "VISA");
		B.selectByVisibleText(B.findbyID("cc_exp_month"), "August");
		B.selectByVisibleText(B.findbyID("cc_exp_year"), "2022");
		B.elementSendkeys(B.findbyID("cc_cvv"), "1234");
		B.elementClick(B.findbyID("book_now"));
		Thread.sleep(5000);
		String attribute = B.getAttribute(B.findbyID("order_no"));
		System.out.println(attribute);
		B.quitWindow();
	
	
	}
}
