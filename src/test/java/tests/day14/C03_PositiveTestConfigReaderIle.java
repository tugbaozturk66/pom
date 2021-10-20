package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C03_PositiveTestConfigReaderIle extends TestBase {
@Test
    public void positiveTestConfig(){
    //sayfaya git
    driver.get(ConfigReader.getProperty("CHUrl"));
    //login butonuna bas
    ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
    concortHotelPage.loginButonu.click();
    //username gir
    concortHotelPage.userNameKutusu.sendKeys(ConfigReader.getProperty("CHValidUsername"));
    //password gir
    concortHotelPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHValidPassword"));
    //login butonuna bas
    concortHotelPage.loginButonu.click();
    //giris basarili yazisi gorunuyor mu test et
    Assert.assertTrue(concortHotelPage.basariliGirisYazisiElementi.isDisplayed());

}
}
