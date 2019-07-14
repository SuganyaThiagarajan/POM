package pages;

import libraries.Annotations;

public class MyLeadsPage extends Annotations {
	
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead")
		.click();
		return new CreateLeadPage();
		
	}
	
	public FindLeadsPage clickFindLead() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
		
	}

}
