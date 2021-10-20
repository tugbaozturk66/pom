package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class QAConcortPage {
    public WebDriver driver;
    public QAConcortPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkloginLinki;
    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement userNameKutusu;
    @FindBy(xpath = "//input[@class='form-control required password']")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;
    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement basariliGirisYazisiElementi;
    @FindBy(xpath = "//li[text()='Username or password is incorrect, please correct them and try again']")
    public WebElement basarisizGirisYazisi;
    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLink;
    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListLink;
    @FindBy(xpath = "//span[text()='Add Hotel']")
    public WebElement addHotelLink;
    @FindBy(id = "Code")
    public WebElement addHotelCodeKutusu;

    public void ConcortHotelLogin(){

    }
}
