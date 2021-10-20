package tests.smokeTest;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class positiveLoginTest {
    @Test
    public void positiveLoginTest(){
    //Bir test method olustur positiveLoginTest()
    // https://qa-environment.concorthotel.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty(""));
    // login butonuna bas
    //test data username: manager ,
    //test data password : Manager1!
    //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test
}
}
