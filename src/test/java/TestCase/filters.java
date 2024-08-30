package TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Entities;
import Pages.Login;
import Pages.RecevierSide;
import TestBase.testCaseBase;

public class filters extends testCaseBase{
	Login login;
	Entities entities;
	RecevierSide recevierSide;
	
	@BeforeMethod
	public void Start() throws InterruptedException {
		setup();
		login = new Login(driver);
		entities = new Entities(driver);
		recevierSide = new RecevierSide(driver);
		
		login.SigninNSUI("pmmeghana200@outlook.com", "Meghana@123");
		login.VerifyHomePage();
		
	}
	//Number-value
	@Test
	public void FilterNumberFieldEqualOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Equals (=)","VALUE","10");
		entities.verifyFilterRelatedToNumber("equal","10");
	}
	@Test
	public void FilterNumberFieldGreaterThanOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Greater Than (>)","VALUE","10");
		entities.recordsPerPage("50/page");
		entities.verifyFilterRelatedToNumber("GreaterThan","10");
	}
	@Test
	public void FilterNumberFieldGreaterThanorEqualOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Greater Than or Equal(>=)","VALUE","10");
		entities.recordsPerPage("50/page");
		entities.verifyFilterRelatedToNumber("GreaterThanorEqual","10");
	}
	@Test
	public void FilterNumberFieldLessThanOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Less Than (<)","VALUE","10");
		entities.verifyFilterRelatedToNumber("LessThan","10");
	}
	
	@Test
	public void FilterNumberFieldLessThanorEqualOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Less Than or Equal(<=)","VALUE","10");
		entities.verifyFilterRelatedToNumber("LessThanorEqual","10");
	}
	@Test
	public void FilterNumberFieldNotExistOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Not Exist","VALUE","10");
		entities.verifyFilterRelatedToNumber("NotExist","10");
	}
	@Test
	public void FilterNumberFieldExistOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Exist","VALUE","10");
		entities.recordsPerPage("50/page");
		entities.verifyFilterRelatedToNumber("Exist","10");
	}
	@Test
	public void FilterNumberFieldRangeOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Range","VALUE","10");
		entities.verifyFilterRelatedToNumber("Range","10");
	}
	//Number-GlobalVariable
	
	@Test
	public void FilterGVFieldEqualOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Equals (=)","GLOBAL_VARIABLE","Number -> 10");
		entities.verifyFilterRelatedToNumber("equal","10");
	}
	@Test
	public void FilterGVFieldGreaterThanOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Greater Than (>)","GLOBAL_VARIABLE","Number -> 10");
		entities.recordsPerPage("50/page");
		entities.verifyFilterRelatedToNumber("GreaterThan","10");
	}
	@Test
	public void FilterGVNumberFieldGreaterThanorEqualOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Greater Than or Equal(>=)","GLOBAL_VARIABLE","Number -> 10");
		entities.recordsPerPage("50/page");
		entities.verifyFilterRelatedToNumber("GreaterThanorEqual","10");
	}
	@Test
	public void FilterGVNumberFieldLessThanOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Less Than (<)","GLOBAL_VARIABLE","Number -> 10");
		entities.verifyFilterRelatedToNumber("LessThan","10");
	}
	
	@Test
	public void FilterGVNumberFieldLessThanorEqualOperator() throws Exception {
		String name="States";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Less Than or Equal(<=)","GLOBAL_VARIABLE","Number -> 10");
		entities.verifyFilterRelatedToNumber("LessThanorEqual","10");
	}
	
	//Number-template
	@Test
	public void FilterTemplateFieldEqualOperator() throws Exception {
		String name="State";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Equals (=)","Template","Population");
		entities.verifyFilterRelatedToNumber("equal","10");
	}
	@Test
	public void FilterTemplateFieldGreaterThanOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Greater Than (>)","Template","Population");
		entities.recordsPerPage("50/page");
		entities.verifyFilterRelatedToNumber("GreaterThan","10");
	}
	@Test
	public void FilterTemplateNumberFieldGreaterThanorEqualOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Greater Than or Equal(>=)","Template","Population");
		entities.recordsPerPage("50/page");
		entities.verifyFilterRelatedToNumber("GreaterThanorEqual","10");
	}
	@Test
	public void FilterTemplateNumberFieldLessThanOperator() throws Exception {
		String name="basicfeildsGeneralImportFromExce7";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Less Than (<)","Template","Population");
		entities.verifyFilterRelatedToNumber("LessThan","10");
	}
	
	@Test
	public void FilterTemplateNumberFieldLessThanorEqualOperator() throws Exception {
		String name="States";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.filters();
		entities.filterNumberField("ID","Less Than or Equal(<=)","Template","Population");
		entities.verifyFilterRelatedToNumber("LessThanorEqual","10");
	}
}
