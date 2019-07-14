package pages;

import libraries.Annotations;

public class MyHomePage extends Annotations {
	
	public MyLeadsPage clickLeadsTab() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}

}
