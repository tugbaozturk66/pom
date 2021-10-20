package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConcortHotelPage {
    WebDriver driver;
   public ConcortHotelPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

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
}
