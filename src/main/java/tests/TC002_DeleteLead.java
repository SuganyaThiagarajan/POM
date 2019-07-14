package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import libraries.Annotations;
import pages.MyHomePage;

public class TC002_DeleteLead extends Annotations  {
	
	@BeforeClass
	public void setData() {
		excelFileName = "TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void DeleteLeadTest(String cName, String fName, String lName)  throws InterruptedException {
		new MyHomePage()
		.clickLeadsTab()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLeadButton()
		.getLeadID()
		.clickDeletebutton()
		.clickFindLead()
		.typeID()
		.clickFindLeads()
		.verifyDeletion();
	}
	
}