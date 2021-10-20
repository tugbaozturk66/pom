package tests.day13;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.TestBase;

public class C02_PagesFacebook extends TestBase {

    //kullanici adi: techproed@hotmail.com
    //sifre:12345
    //yazdigimizda giris yapamadigimizi test edin
    @Test
    public void test(){
        //facebook sayfasina gidin
        driver.get("https://www.facebook.com");
        FacebookPage facebookPage=new FacebookPage(driver);
        facebookPage.ePosta.sendKeys("techproed@hotmail.com");
    facebookPage.sifre.sendKeys("12345");
    facebookPage.girisYap.click();
        Assert.assertTrue(facebookPage.hataYazisi.isDisplayed(),"hata yazisi gorunmuyor");
    }
}
