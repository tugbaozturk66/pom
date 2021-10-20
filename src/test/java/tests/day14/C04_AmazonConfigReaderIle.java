package tests.day14;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C04_AmazonConfigReaderIle extends TestBase {
    @Test
    public void test(){
        //amazon sayfasina git
        driver.get(ConfigReader.getProperty("amazonUrl"));
        //nutella icin arma yap
        AmazonPage amazonPage=new AmazonPage(driver);
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("")+ Keys.ENTER);
        //sonuc sayisini yazirip sonuc yazisinin nutella icerdigini test edin
        System.out.println(amazonPage.sonucYazisiElementi.getText());
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("amazonArananKelime"));

    }
}
