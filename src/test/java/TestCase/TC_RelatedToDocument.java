package TestCase;

import org.testng.annotations.BeforeMethod;

import Pages.Dashboard;
import Pages.Login;
import TestBase.testCaseBase;

public class TC_RelatedToDocument extends testCaseBase{
	Login login;
	Dashboard dashboard;

	@BeforeMethod
	public void Start() {
		setup();
		login = new Login(driver);
	}
}