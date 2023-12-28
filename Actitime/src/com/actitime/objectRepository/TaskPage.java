package com.actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//declaration

	@FindBy(xpath="//div[.='Add New']")
	private WebElement addbtn;

	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement nwcbtn;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement desctriptio;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement creatbtn;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelbtn;
	
	//initilization
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//utilization

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getNwcbtn() {
		return nwcbtn;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getDesctriptio() {
		return desctriptio;
	}

	public WebElement getCreatbtn() {
		return creatbtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}	
}
