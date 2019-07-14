package pages;

import libraries.Annotations;

public class CreateLeadPage extends Annotations {
	
	public CreateLeadPage typeCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName")
		.sendKeys(cName);
		return this;
	}
	
	public CreateLeadPage typeFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName")
		.sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage typeLastName(String lName) {
		driver.findElementById("createLeadForm_lastName")
		.sendKeys(lName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElementByClassName("smallSubmit")
		.click();
		return new ViewLeadPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
