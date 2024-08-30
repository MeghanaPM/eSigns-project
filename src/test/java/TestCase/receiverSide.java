package TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Addrecipients;
import Pages.DocumentsScenarios;
import Pages.Entities;
import Pages.Login;
import Pages.RecevierSide;
import TestBase.testCaseBase;

public class receiverSide extends testCaseBase {
	Login login;
	Addrecipients addrecipients;
	DocumentsScenarios documentsScenarios;
	Entities entities;
	RecevierSide receiverSide;
	@BeforeMethod
	public void Start() {
		setup();
		login = new Login(driver);
		addrecipients = new Addrecipients(driver);
		documentsScenarios = new DocumentsScenarios(driver);
		entities=new Entities(driver);
		receiverSide=new RecevierSide(driver);
	}
	@Test
	public void receiversideCheck() throws Exception {
		String Doc="receiverSide";
		login.SigninNSUI("jeevitha.patnana@nimbleaccounting.com","Nikki@1338");
		login.VerifyHomePage();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(Doc);
		addrecipients.personalOutlook();
		documentsScenarios.Saveuser();
		documentsScenarios.Recipient(2, "Receiver","meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.SubDocScenarios(Doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		receiverSide.receiverSideCheck();
	}
	
	@Test
	public void receiversideSignatureCheck() throws Exception {
//		login.SigninNSUI();
//		login.VerifyHomePage();
//		documentsScenarios.DocScenario();
//		documentsScenarios.Blankloginaccount(Doc);
//		addrecipients.personalOutlook();
//		documentsScenarios.Saveuser();
//		receiverSide.receiverSignatureFullNameFeild();
//		documentsScenarios.SubDocScenarios(Doc);
//		documentsScenarios.clickSubmit();
//		documentsScenarios.Verifysubmit();
		receiverSide.receiverSideCheck();
	}
}