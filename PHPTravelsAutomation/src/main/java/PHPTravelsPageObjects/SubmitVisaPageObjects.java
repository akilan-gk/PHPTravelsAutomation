package PHPTravelsPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubmitVisaPageObjects {
    @FindBy(xpath = "//input[@name='first_name']")
    public static WebElement firstNameTextBox;
    @FindBy(xpath="//input[@name='last_name']")
    public static WebElement lastNameTextBox;
    @FindBy(xpath="//input[@name='email']")
    public static WebElement emailTextBox;
    @FindBy(xpath="//input[@name='phone']")
    public static WebElement phoneTextBox;
    @FindBy(xpath="//input[@name='date']")
    public static WebElement datePicker;
    @FindBy(xpath="(//td[@class='day  active'])[1]")
    public static WebElement currentDate;
    @FindBy(xpath="//textarea[@name='notes']")
    public static WebElement notesBox;

    @FindBy(xpath = "//button[@id='submit']")
    public static WebElement submitButton;

    @FindBy(xpath = "//div[@class='card-body my-5 text-center']/h2")
    public static WebElement submissionTextElement;
}
