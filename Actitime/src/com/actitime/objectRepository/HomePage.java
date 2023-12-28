package com.actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
@FindBy(xpath="//div[.='Tasks']")
private WebElement tasklink;

@FindBy(xpath="//div[.='Reports']")
private WebElement reportlink;

@FindBy(xpath="//div[.='Users']")
private WebElement userlink;

@FindBy(id="logoutLink")
private WebElement lgbtn;

////Intilization

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//Utilization

public WebElement getTasklink() {
	return tasklink;
}

public WebElement getReportlink() {
	return reportlink;
}

public WebElement getUserlink() {
	return userlink;
}

public WebElement getLgtbtn() {
	return lgbtn;
}

}