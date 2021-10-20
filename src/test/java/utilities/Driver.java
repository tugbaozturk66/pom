package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
   private Driver(){}
    private static WebDriver driver;
    //driver'i baska class lardan sadece class ismi ile cagirabilmek icin static yaptik
    //henuz bu driver ile ilgili ayarlar yapmadigim icin baska classlar bunu kullanmasin diye erisimi private yaptik. sadece bu classin kullanmina acik.
    public static WebDriver getDriver(){
        if (driver==null) {
            //her method calistiginda yeni bir driver olusturmamasi icin if kullaniyoruz
            //if driveri kontrol edecek eger bir deger atamasi yapildiysa yeni bir driver olusturmayacak
            switch (ConfigReader.getProperty("browser")) {
                //configreader de hangi tarayici varsa onunla islem yapmasi icin switch kullaniliyor
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }


            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
        }
    public static void closeDriver(){
        if(driver!=null){
driver.quit();
    }
        //burada yeniden null degeri atamamizin nedeni bir sonraki getdriver methodu cagirildiginda
        // yeni deger bir deger atayabilmek icindir.
        driver=null;
    }

}
