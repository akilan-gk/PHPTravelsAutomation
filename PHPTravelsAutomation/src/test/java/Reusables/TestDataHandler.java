package Reusables;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestDataHandler {
    private String testDataFilePath() {
        return System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" +
                File.separator + "resources" + File.separator + "testdata.properties";
    }

    public Properties getTestDataPropertiesObject() {
        Properties property = new Properties();
        try {
            FileInputStream file = new FileInputStream(testDataFilePath());
            property.load(file);
        } catch (FileNotFoundException exception) {
            System.out.println("The specified file is not present in the given path.");
        } catch (IOException exception) {
            System.out.println("Check the file in the specified path.");
        }
        return property;
    }

    public String getFlightsURL() {
        return getTestDataPropertiesObject().getProperty("flightsURL");
    }

    public String getVisaURL() {
        return getTestDataPropertiesObject().getProperty("visaURL");
    }

    public String getBrowser() {
        return getTestDataPropertiesObject().getProperty("browser");
    }

    public String getLog4JConfigFilePath() {
        return getTestDataPropertiesObject().getProperty("log4JConfigFilePath");
    }

    public String getFlightsPageTitle() {
        return getTestDataPropertiesObject().getProperty("flightsPageTitle");
    }

    public String getVisaPageTitle() {
        return getTestDataPropertiesObject().getProperty("visaPageTitle");
    }

    public String getFlightSelectionPageTitle() {
        return getTestDataPropertiesObject().getProperty("flightSelectionPageTitle");
    }

    public String getFlightBookingPageTitle() {
        return getTestDataPropertiesObject().getProperty("flightsBookingPageTitle");
    }

    public String getFromText() {
        return getTestDataPropertiesObject().getProperty("fromText");
    }

    public String getVisaFrom() {
        return getTestDataPropertiesObject().getProperty("visaFrom");
    }

    public String getVisaTo() {
        return getTestDataPropertiesObject().getProperty("visaTo");
    }

    public String getToText() {
        return getTestDataPropertiesObject().getProperty("toText");
    }

    public String getFirstName() {
        return getTestDataPropertiesObject().getProperty("firstName");
    }

    public String getLastName() {
        return getTestDataPropertiesObject().getProperty("lastName");
    }

    public String getEmail() {
        return getTestDataPropertiesObject().getProperty("email");
    }

    public String getPhoneNumber() {
        return getTestDataPropertiesObject().getProperty("phone");
    }

    public String getNotesText() {
        return getTestDataPropertiesObject().getProperty("notes");
    }

    public String getVisaSubmissionPageTitle() {
        return getTestDataPropertiesObject().getProperty("visaSubmissionPageTitle");
    }

    public String getSubmissionText() {
        return getTestDataPropertiesObject().getProperty("submissionText");
    }
}
