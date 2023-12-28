package com.actitime.TestScript;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.library.BaseClass;
import com.actitime.generic.library.FileLibrary;
import com.actitime.generic.library.ListnerImplementation;
import com.actitime.objectRepository.HomePage;
import com.actitime.objectRepository.TaskPage;

@Listeners(ListnerImplementation.class)
public class CreateCustomer extends BaseClass {
@Test
public void createCustomer() throws EncryptedDocumentException, IOException {
	HomePage hp=new HomePage(driver);
	hp.getTasklink().click();
	
	TaskPage tp =new TaskPage(driver);
	tp.getAddbtn().click();
	tp.getNwcbtn().click();
	
	FileLibrary f=new  FileLibrary();
	String custumername = f.readDataFromExcel("pk", 2, 1);
	tp.getCustname().sendKeys(custumername);
	String customerdesp = f.readDataFromExcel("pk", 2, 2);
	Assert.fail();
	tp.getDesctriptio().sendKeys(customerdesp);
	tp.getCreatbtn().click();
}
}