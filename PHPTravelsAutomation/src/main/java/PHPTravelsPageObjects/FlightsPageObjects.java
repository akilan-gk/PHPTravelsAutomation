package PHPTravelsPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsPageObjects {
    @FindBy(css="div[class='autocomplete-wrapper _1 row_1']>input")
    public static WebElement fromTextBox;
    @FindBy(css="div[class='autocomplete-wrapper _1 row_2']>input")
    public static WebElement toTextBox;
    @FindBy(xpath = "(//input[@name='depart'])[1]")
    public static WebElement departureDate;
    @FindBy(xpath = "(//td[@class='day  active'])[1]")
    public static WebElement currentDate;
    @FindBy(css = "button#flights-search")
    public static WebElement flightSearch;

    @FindBy(id = "round-trip")
    public static WebElement roundTrip;

    @FindBy(css = "input#return")
    public static WebElement returnDate;

    @FindBy(xpath = "(//td[@class='day  active'])[2]")
    public static WebElement nextReturnDate;
}
