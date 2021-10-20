package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C05_NegativeTestConfigReader extends TestBase {
    @Test
    public void test(){
        //concorthotel adrsine gidin
        driver.get(ConfigReader.getProperty("CHUrl"));
        //login butonuna bas
        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        concortHotelPage.ilkloginLinki.click();
        //username gir
        concortHotelPage.userNameKutusu.sendKeys(ConfigReader.getProperty("CHInvalidUsername"));
        //password gir
        concortHotelPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHInvalidPassword"));
        concortHotelPage.loginButonu.click();
        //degerler girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(concortHotelPage.basarisizGirisYazisi.isDisplayed());

    }
}
