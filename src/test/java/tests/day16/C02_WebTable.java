package tests.day16;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;

public class C02_WebTable {
    @Test
    public void test(){
        //Bir class oluşturun : C02_WebTables
        //● login() metodun oluşturun ve oturum açın.
        //● https://www.concorthotel.com//admin/HotelRoomAdmin adresine gidin
        // ○ Username : manager
        // ○ Password : Manager1!
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();
        qaConcortPage.hotelManagementLink.click();
        qaConcortPage.hotelRoomLink.click();
        //● table() metodu oluşturun
        // ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        // ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        for (WebElement w:qaConcortPage.basliklarListesi) {
            System.out.println(w.getText());
        }
        System.out.println("qaConcortPage.basliklarListesi.size() = " + qaConcortPage.basliklarListesi.size());
        //● printRows() metodu oluşturun //tr
        // ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        System.out.println(qaConcortPage.tBodyTumu.getText());
        Assert.assertTrue(qaConcortPage.tBodyTumu.getText().contains("HAPPY HOTEL"));
        // ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        System.out.println("qaConcortPage.satirlarListesi.size() = " + qaConcortPage.satirlarListesi.size());
        //tum satirlari sirayla yazdir
        for (int i=0; i<qaConcortPage.satirlarListesi.size();i++){
            System.out.println((i+1)+" satir: "+ qaConcortPage.satirlarListesi.get(i).getText());
        }
        // ○ 4.sutundaki elementleri konsolda yazdırın
        for (WebElement w:qaConcortPage.herSatirDorduncuEleman
             ) {
            System.out.println(w.getText());
        }

    }
}
