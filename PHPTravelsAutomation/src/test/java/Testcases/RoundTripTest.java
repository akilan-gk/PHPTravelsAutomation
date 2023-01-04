package Testcases;

import PHPTravelsPageObjects.FlightSelectionPageObjects;
import PHPTravelsPageObjects.FlightsPageObjects;
import Reusables.ActionReusables;
import Reusables.BrowserHandler;
import Reusables.TestDataHandler;
import Reusables.VerificationReusables;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Test Case ID = 02
 * Test Description = Verifying the Round Trip functionality
 **/

public class RoundTripTest extends BrowserHandler {
    static Logger logger = Logger.getLogger(RoundTripTest.class);

    @Test
    public void testRoundTrip() {
        ActionReusables actionReusables = new ActionReusables(driver);
        VerificationReusables verificationReusables = new VerificationReusables();
        TestDataHandler testDataHandler = new TestDataHandler();
        PageFactory.initElements(driver, FlightsPageObjects.class);
        PageFactory.initElements(driver, FlightSelectionPageObjects.class);
        logger.info("Opening the PHP Travels Flights URL");
        actionReusables.openURL(testDataHandler.getFlightsURL());
        logger.info("Verifying Flight Page Title");
        verificationReusables.verifyPageTitle(actionReusables.getPageTitle(), testDataHandler.getFlightsPageTitle(), "Flights Page Title Mismatch");
        logger.info("Clicking on Round Trip");
        actionReusables.click(FlightsPageObjects.roundTrip);
        logger.info("Entering From Text");
        actionReusables.sendText(FlightsPageObjects.fromTextBox, testDataHandler.getFromText());
        logger.info("Entering To Text");
        actionReusables.sendText(FlightsPageObjects.toTextBox, testDataHandler.getToText());
        logger.info("Clicking on Departure Date");
        actionReusables.click(FlightsPageObjects.departureDate);
        logger.info("Clicking on Current Date");
        actionReusables.click(FlightsPageObjects.currentDate);
        logger.info("Clicking on Return Date");
        actionReusables.click(FlightsPageObjects.returnDate);
        logger.info("Clicking on Next Return Date");
        actionReusables.click(FlightsPageObjects.nextReturnDate);
        logger.info("Clicking on Flight Search");
        actionReusables.click(FlightsPageObjects.flightSearch);
        actionReusables.safePause();
        logger.info("Verifying Flight Selection Page Title");
        verificationReusables.verifyPageTitle(actionReusables.getPageTitle(), testDataHandler.getFlightBookingPageTitle(), "Flights Selection Page Title Mismatch");
        /*logger.info("Selecting Flight");
        actionReusables.click(FlightSelectionPageObjects.firstFlight);
        actionReusables.safePause();
        logger.info("Verifying Flight Booking Page Title");
        verificationReusables.verifyPageTitle(actionReusables.getPageTitle(), testDataHandler.getFlightsBookingPageTitle(), "Flights Booking Page Title Mismatch");*/
    }
}
