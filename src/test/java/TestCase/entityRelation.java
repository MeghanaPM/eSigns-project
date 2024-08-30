package TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Entities;
import Pages.Login;
import Pages.RecevierSide;
import TestBase.testCaseBase;

public class entityRelation extends testCaseBase{
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
	@Test
	public void syncRelation() throws Exception {
		String temp1="TeacherTemp4";
		String temp2="StudentTemp4";
		String data[]= {"bannu","reddy","P","bannu@abccorp.org","student","Gurramkonda","9505616606","bannu"};
		entities.entity();
//		entities.ClickCreateEntity();
//		entities.CreateEntityFromScratch(temp1, "Start from scratch", "INDIVIDUAL");
//		entities.entityCreateCmpltAfterRelationAdd();
//		entities.FormTemplate();
//		entities.CreateFormtemplate(temp2);
//		entities.submit();
//		entities.singleLineTextDragAndDrop();
//		entities.EntityFieldDragAndDrop(temp1);
//		entities.SaveButton();
//		entities.x();
//		entities.entity();
//		entities.ClickCreateEntity();
//		entities.CreateEntityFromScratch(temp2, "Start from scratch", "INDIVIDUAL");
//		entities.addTempToEntity(temp2);
//		entities.syncRelationAdd(); 
//		entities.entityCreateCmpltAfterRelationAdd(); 
//		entities.ClickEntityAction(temp1); 
//		entities.AddContactDetailsOnlyToEntity("Meghana","reddy","PM","meghana@abccorp.org","Teacher","Gurramkonda","9347618053");
//		entities.back();
		entities.ClickEntityAction(temp2); 
		entities.AddContactDetailsOnlyToEntity("bannu","reddy","P","bannu@abccorp.org","student","Gurramkonda","9505616606");
		entities.enterName("bannu");
		entities.SpanButton("Save");
		entities.back();
		entities.ClickEntityAction(temp1); 
		entities.EyeIcon();
		entities.clickOnTempInEntityView();
		entities.VerifyData();
	}
	@Test
	public void enterInvalidDataInEntity() throws Exception {
		String name="enterInvalidDataInEntity";
		entities.entity();
		entities.ClickCreateEntity();
		entities.CreateEntityFromScratch(name, "Start from scratch", "INDIVIDUAL");
		entities.entityCreateCmpltAfterRelationAdd();
		entities.ClickEntityAction(name); 
		entities.AddContactDetailsOnlyToEntity(" ","reddy","P","bannu@abccorp.org","student","Gurramkonda","9505616606");
		entities.SpanButton("Save");
		entities.errorNotification(); 
	}
	@Test
	public void enterInvalidEmailInEntity() throws Exception {
		String name="enterInvalidDataInEntity";
		entities.entity();
		entities.ClickEntityAction(name); 
		entities.AddContactDetailsOnlyToEntity("Bannu","reddy","P","9347618053","student","Gurramkonda","9505616606");
		entities.SpanButton("Save");
		entities.errorNotification(); 
	}
	
	
}
