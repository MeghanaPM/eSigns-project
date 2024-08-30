package TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.DocumentsScenarios;
import Pages.Entities;
import Pages.Login;
import Pages.RecevierSide;
import Pages.globalVariables;
import TestBase.testCaseBase;

public class globalVariable extends testCaseBase {
	Login login;
	globalVariables GlobalVariable;
	Entities entities;
	DocumentsScenarios documentsScenarios;
	RecevierSide recevierSide;
	
	@BeforeMethod
	public void Start() throws InterruptedException {
		setup();
		login = new Login(driver);
		GlobalVariable = new globalVariables(driver);
		entities = new Entities(driver);
		documentsScenarios = new DocumentsScenarios(driver);
		recevierSide = new RecevierSide(driver);
		login.SigninNSUI("pmmeghana200@outlook.com", "Meghana@123");
		login.VerifyHomePage();
	}

	// TC_Glo_Var_01:Verifying the Global Variable Button
	@Test
	public void clickGlobalVariableButton() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
	}
	// TC_Glo_Var_02:Add variable

	@Test
	public void ClickNewVariable() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
	}

	// TC_Glo_Var_03:Single Line text
	@Test
	public void singleLineText() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.selectNumberOrSinglineTextField("Single Line Text","Single Line Text", "meghana123", "");
	}

	// TC_Glo_Var_04:Multi Line Text
	@Test
	public void multiLineText() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.multiLine("Multi Line Text","Multi Line Text", "Peter Piper picked a peck of pickled peppers. A journey of a thousand miles begins with a single step.", "");
	}
	//TC_Glo_Var_05:Select
	@Test
	public void select() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.selectField("Select");
	}
	
	//TC_Glo_Var_06:Multiple Select
	@Test
	public void multiSelect() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.selectField("Multiple Select");
	}
	//TC_Glo_Var_07:Number 
	@Test
	public void Number() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.selectNumberOrSinglineTextField("Number","Number", "10", "");
	}
	//TC_Glo_Var_08:Date
	@Test
	public void Date() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.dateField("Date");
	}
	//TC_Glo_Var_09:Time
	@Test
	public void time() throws Exception {
	GlobalVariable.clickGlobalVariable();
	GlobalVariable.VerifyClickGlobalVariable();
	GlobalVariable.clickNewVariable();
	GlobalVariable.selectDataType();
	GlobalVariable.Time("Time");
}
	//TC_Glo_Var_10:Date Time
	@Test
	public void dateTime() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.dateTime("Date Time");
	}
	//TC_Glo_Var_11:Date Time Range 
	@Test
	public void dateTimeRange() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.dateTimeRange("Date Time Range");
	}
	//TC_Glo_Var_12:Date Range 
	@Test
	public void dateRange() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.dateRange("Date  Range");
	}
	//TC_Glo_Var_13:Time Range
	@Test
	public void timeRange() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.timeRange("Time Range");
	}
	//TC_Glo_Var_14:Weekdays
	@Test
	public void Weekdays() throws Exception {
		GlobalVariable.clickGlobalVariable();
		GlobalVariable.VerifyClickGlobalVariable();
		GlobalVariable.clickNewVariable();
		GlobalVariable.selectDataType();
		GlobalVariable.weekdays("Weekdays");
	}
	
	//FixedTime:Hold
	
	@Test
	public void fixedTime() throws Exception {
	GlobalVariable.clickGlobalVariable();
	GlobalVariable.VerifyClickGlobalVariable();
	GlobalVariable.clickNewVariable();
	GlobalVariable.selectDataType();
	GlobalVariable.fixedTime("Time");
}
	//Add The template which contains global variables in to an entity
	@Test
	public void addToEntity() throws Exception {
		String arr[] = { "1", "06-01-2024 To 07-01-2024", "IMG", "06-05-2024 00:00:00", "YES", "Monday",
				"PemmaMohan ReddyMeghana", "06-01-2024", "TESTING.pdf", " ", "01:00", "List", "12:12:12", "1",
				"Computer science,maths", "9347618053", "Computer science", " PemmaMohan ReddyMeghana ", "1,2" };
		String docname="AddToEntity10";
		entities.entity();
		entities.ClickCreateEntity();
		entities.CreateEntityFromScratch(docname, "Start from scratch", "INDIVIDUAL");
		entities.addtemplate(" gv ");
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(docname);
		documentsScenarios.addContactAtAddrecipient(1, docname, "prudhvib200@outlook.com", "prudhvi", "b", "SIGNER");
		documentsScenarios.Recipient(1, docname, "prudhvib200@outlook.com", "SIGNER");
		documentsScenarios.Saveuser();
		documentsScenarios.DradAndDropSigAndFullName(2, -250, -220, 0, -220);
		GlobalVariable.globalVariableDragAndDrop();
		documentsScenarios.SubDocScenarios(docname);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		recevierSide.firstOutlooklogin("prudhvib200@outlook.com");
		recevierSide.clickEmail(docname);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.receiverSideUpdatedBasicFeildsFill();
		login.SigninNSUI("pmmeghana200@outlook.com","Meghana@123");
		entities.entity();
		entities.ClickEntityAction(docname);
		entities.verifyBasicFieldDataFillInIndividualEntity();
	}
	@Test
	public void aa() throws Exception {
		GlobalVariable.companyProfile("gv");
	}
	
	
	
	
	
}