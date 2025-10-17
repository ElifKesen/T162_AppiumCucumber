package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KiwiPage {
    public KiwiPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }

    @FindBy(xpath = "//*[@text='Continue as a guest']")
    public WebElement ContinueASGButton;

    @FindBy(xpath = "//*[@text='Continue']")
    public WebElement ContinueButton;

    @FindBy(xpath = "//*[@text='One way']")
    public WebElement OneWayButton;

    @FindBy(xpath = " (//*[@class='android.view.View'])[5]")
    public WebElement secimButton;

}
