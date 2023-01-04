package PHPTravelsPageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisaPageObjects {
    @FindBy(xpath = "//ul[@class='select2-results__options']/li[text()='Albania']")
    public static WebElement selectFromCountry;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[1]")
    public static WebElement fromCountryDropdown;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[2]")
    public static WebElement toCountryDropdown;

    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']/input")
    public static WebElement textBox;

    @FindBy(xpath = "//ul[@class='select2-results__options']/li[text()='India']")
    public static WebElement selectToCountry;

    @FindBy(css = "input#date")
    public static WebElement datePicker;

    @FindBy(xpath = "(//td[@class='day  active'])[1]")
    public static WebElement currentDate;

    @FindBy(css = "button#submit")
    public static WebElement submit;
}
