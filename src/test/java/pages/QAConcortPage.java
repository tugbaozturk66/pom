package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

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
    @FindBy(partialLinkText ="Hotel Rooms")
    public  WebElement hotelRoomLink;
    @FindBy(xpath = "//span[text()='Add Hotelroom ']")
    public WebElement addRoomButton;
    @FindBy(id="IDHotel")
    public WebElement addRoomIdDropDown;
    @FindBy(id="IDGroupRoomType")
    public WebElement addRoomType;
    @FindBy(xpath="//button[@id='btnSubmit']")
    public WebElement saveButonu;
    @FindBy(className="hidden-480")
    public WebElement addHotelLink;
    @FindBy(id = "Code")
    public WebElement addHotelCodeKutusu;
    @FindBy(id = "btnSubmit")
    public WebElement createHotelSave;

    @FindBy(id = "IDGroup")
    public WebElement selectGroup;

    @FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
    public WebElement htmlAlertYazisi;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement addRoomSuccessfulYazisi;

    @FindBy(xpath = "//button[@class='btn btn-primary']\n")
    public WebElement alertOk;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement addRoomAllertOkButonu;
    @FindBy(linkText = "Hotelrooms")
    public WebElement addRoomHotelRoomsLinki;
    @FindBy(xpath = "//span[text()='List Of Hotelrooms']")
    public WebElement ListofHotelsRoomyazisi;
    @FindBy(xpath = "//thead/tr[1]/th")
    public List<WebElement> basliklarListesi;
    @FindBy(xpath = "//tbody")
    public WebElement tBodyTumu;
    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirlarListesi;
    @FindBy(xpath = "//tbody//tr[1]")
    public WebElement birinciSatir;
    @FindBy(xpath = "//tbody//td[4]")
    public List<WebElement> herSatirDorduncuEleman;




    public void ConcortHotelLogin(){
Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
QAConcortPage qaConcortPage=new QAConcortPage();
qaConcortPage.ilkloginLinki.click();
qaConcortPage.userNameKutusu.sendKeys(ConfigReader.getProperty("CHQAValidUsername"));
qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
qaConcortPage.loginButonu.click();

    }
}
