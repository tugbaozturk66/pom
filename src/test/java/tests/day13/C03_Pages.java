package tests.day13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.TestBase;

public class C03_Pages extends TestBase {
    @Test
    public void test() throws InterruptedException {
        // amazon sayfasina gidin
        driver.get("https://www.amazon.com");
        AmazonPage amazonPage=new AmazonPage(driver);
        // dropdown menuden book kategorisini secin
        Select select=new Select(amazonPage.dropDown);
        select.selectByVisibleText("Books");
// java icin arama yapin
        Thread.sleep(3000);
        amazonPage.aramaKutusu.sendKeys("java"+ Keys.ENTER);

// bulunan sonuc sayisini yazin
        System.out.println("sonucYazisi " + amazonPage.sonucYazisiElementi.getText());
// ilk urunun isminde Java gectigini test edin
        Assert.assertTrue(amazonPage.ilkSonuc.getText().contains("Java"),"java icermiyor");



    }
}
