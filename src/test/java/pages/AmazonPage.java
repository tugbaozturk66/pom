package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestBase;

public class AmazonPage {
    WebDriver driver;
   //bir  constructure olusturup driver e ilk degeri atariz
    public AmazonPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    AmazonPage(){

    }
    @FindBy(id="twotabsearchtextbox")
    public  WebElement aramaKutusu;
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public  WebElement sonucYazisiElementi;
    @FindBy(id = "searchDropdownBox")
    public WebElement dropDown;
@FindBy(xpath = "//span[text()='Effective Java']")
public WebElement ilkSonuc;
}
