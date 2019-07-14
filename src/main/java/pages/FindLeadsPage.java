package pages;

public class FindLeadsPage extends ViewLeadPage{

	public FindLeadsPage typeID()
	{
		driver.findElementByXPath("//input[@name=\"id\"]").sendKeys(leadId);
		return this;
	}
	
	public FindLeadsPage clickFindLeads() throws InterruptedException
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		return this;
	}
	
	public FindLeadsPage verifyDeletion()
	{
		String output = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println("Deleteion Confirm: "+output);
		return this;
	}
	
}
