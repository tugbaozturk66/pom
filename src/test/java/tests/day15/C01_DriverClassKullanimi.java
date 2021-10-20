package tests.day15;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassKullanimi {
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));
//Driver driver=new Driver();
//Driver class indan obje uretilmesin istedigimiz icin Driver classi SINGLETON yapiyoruz
// yani obje olusturlamasin istiyoruz. default constructure yerine parametresiz bir constructure olusturup
// access modifierini private yapiyoruz.
        //Driver driver=new Driver("");
//Driver class inda parametreli const olmadigi icin kullanamayiz
        Driver.closeDriver();
    }
}
