package Testcases;


import PHPTravelsPageObjects.*;
import Reusables.ActionReusables;
import Reusables.BrowserHandler;
import Reusables.TestDataHandler;
import Reusables.VerificationReusables;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Test Case ID = 03
 * Test Description = Verifying the Visa Submission functionality
 **/
public class VisaSubmissionTest extends BrowserHandler {
    static Logger logger = Logger.getLogger(VisaSubmissionTest.class);
    @Test
    public void testVisaSubmission() {
        ActionReusables actionReusables = new ActionReusables(driver);
        VerificationReusables verificationReusables = new VerificationReusables();
        TestDataHandler testDataHandler = new TestDataHandler();
        PageFactory.initElements(driver, VisaPageObjects.class);
        PageFactory.initElements(driver, SubmitVisaPageObjects.class);
        logger.info("Opening the Visa URL");
        actionReusables.openURL(testDataHandler.getVisaURL());
        logger.info("Verifying Visa Page Title");
        verificationReusables.verifyPageTitle(actionReusables.getPageTitle(), testDataHandler.getVisaPageTitle(), "Visa Page Title Mismatch");
        logger.info("Clicking on From Country Dropdown");
        actionReusables.click(VisaPageObjects.fromCountryDropdown);
        actionReusables.safePause();
        logger.info("Entering from search text");
        actionReusables.click(VisaPageObjects.textBox);
        actionReusables.sendText(VisaPageObjects.textBox,testDataHandler.getVisaFrom());
        logger.info("Select from country");
        actionReusables.click(VisaPageObjects.selectFromCountry);
        logger.info("Clicking on To Country Dropdown");
        actionReusables.click(VisaPageObjects.toCountryDropdown);
        actionReusables.safePause();
        logger.info("Entering to search text");
        actionReusables.click(VisaPageObjects.textBox);
        actionReusables.sendText(VisaPageObjects.textBox,testDataHandler.getVisaTo());
        logger.info("Select to country");
        actionReusables.click(VisaPageObjects.selectToCountry);
        logger.info("Clicking on Date");
        actionReusables.click(VisaPageObjects.datePicker);
        logger.info("Clicking on Current Date");
        actionReusables.click(VisaPageObjects.currentDate);
        logger.info("Clicking on submit button");
        actionReusables.click(VisaPageObjects.submit);
        actionReusables.safePause();
        logger.info("Verifying Visa Submit Page Title");
        verificationReusables.verifyPageTitle(actionReusables.getPageTitle(), testDataHandler.getVisaPageTitle(), "Visa Submit Page Title Mismatch");
        logger.info("Entering First Name");
        actionReusables.sendText(SubmitVisaPageObjects.firstNameTextBox,testDataHandler.getFirstName());
        logger.info("Entering Last Name");
        actionReusables.sendText(SubmitVisaPageObjects.lastNameTextBox,testDataHandler.getLastName());
        logger.info("Entering Email ID");
        actionReusables.sendText(SubmitVisaPageObjects.emailTextBox,testDataHandler.getEmail());
        logger.info("Entering Phone Number");
        actionReusables.sendText(SubmitVisaPageObjects.phoneTextBox,testDataHandler.getPhoneNumber());
        logger.info("Clicking on Date Picker");
        actionReusables.clickUsingJavaScriptExecutor(SubmitVisaPageObjects.datePicker);
        logger.info("Selecting Date");
        actionReusables.click(SubmitVisaPageObjects.currentDate);
        logger.info("Entering Notes");
        actionReusables.sendText(SubmitVisaPageObjects.notesBox,testDataHandler.getNotesText());
        logger.info("Clicking on Submit");
        actionReusables.clickUsingJavaScriptExecutor(SubmitVisaPageObjects.submitButton);
        actionReusables.safePause();
        logger.info("Verifying Visa Submission Page Title");
        verificationReusables.verifyPageTitle(actionReusables.getPageTitle(), testDataHandler.getVisaSubmissionPageTitle(), "Visa Submission Page Title Mismatch");
        logger.info("Verifying Visa Submission Text");
        verificationReusables.verifyText(actionReusables.getTextFromElement(SubmitVisaPageObjects.submissionTextElement),testDataHandler.getSubmissionText(),"Submission Text Mismatch");
    }
}
