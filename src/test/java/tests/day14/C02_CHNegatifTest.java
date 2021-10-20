package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.TestBase;

public class C02_CHNegatifTest extends TestBase {
    @Test
    public void test(){
        //Bir test method olustur NegativeLoginTest()
        // https://www.concorthotel.com/ adresine git
        driver.get("https://www.concorthotel.com/");
        // login butonuna bas
        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        concortHotelPage.ilkloginLinki.click();
        // test data username: manager1 ,
        concortHotelPage.userNameKutusu.sendKeys("manager1");
        // test data password : manager1!
        concortHotelPage.passwordKutusu.sendKeys("manager1!");
        concortHotelPage.loginButonu.click();
        // Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(concortHotelPage.basarisizGirisYazisi.isDisplayed());
    }

}
