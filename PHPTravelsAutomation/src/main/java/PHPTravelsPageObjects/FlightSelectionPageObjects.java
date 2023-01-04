package PHPTravelsPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSelectionPageObjects {

    @FindBy(xpath = "//ul[@class='catalog-panel']/li[1] //button[@class='btn btn-block theme-search-results-item-price-btn ladda waves-effect']")
    public static WebElement firstFlight;
}
