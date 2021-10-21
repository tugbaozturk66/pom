package tests.day15;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.Driver;

public class C02_E2ETest {
    @Test
    public void Test() throws InterruptedException {
    //1. Tests packagenin altına class olusturun: D17_CreateHotel
    //2. Bir metod olusturun: createHotel
    //3. http://qa-environment.koalaresorthotels.com adresine git.
    //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri
    //girin.
    //a. Username : manager
    //b. Password : Manager1!
    //5. Login butonuna tıklayın.
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();
    //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        qaConcortPage.hotelManagementLink.click();
        qaConcortPage.hotelListLink.click();
        qaConcortPage.addHotelLink.click();
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(qaConcortPage.addHotelCodeKutusu)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().country())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .perform();
        Select select =new Select(qaConcortPage.selectGroup);
        select.selectByIndex(2);
    //8. Save butonuna tıklayın.
        qaConcortPage.createHotelSave.click();
        Thread.sleep(8000);
    //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(qaConcortPage.htmlAlertYazisi.isDisplayed());

    //10. OK butonuna tıklayın.
        //Driver.getDriver().switchTo().alert().accept();
       qaConcortPage.alertOk.click();
       Driver.closeDriver();
}
}