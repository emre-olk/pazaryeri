package database.veri_ekle;
import database.database_con;
import java.util.Random;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import properties.degiskenler;
public class veri_ekle {
    public int sayac = 248;
    public static void main(String[] args) {
        veri_ekle a = new veri_ekle();
        a.ekle("https://www.mavi.com/erkek/pantolon/c/2", "erkek", "pantolon"); 
        a.ekle("https://www.mavi.com/kadin/pantolon/c/1", "kadın","pantolon");     
        a.ekle("https://www.mavi.com/erkek/jean/c/2", "erkek", "jean");
        a.ekle("https://www.mavi.com/kadin/jean/c/1", "kadın", "jean");
        a.ekle("https://www.mavi.com/kadin/gomlek/c/1", "kadın", "gömlek");
        a.ekle("https://www.mavi.com/erkek/gomlek/c/2", "erkek", "gömlek");
        a.ekle("https://www.mavi.com/erkek/sweatshirt/c/2", "erkek", "sweatshirt");
        a.ekle("https://www.mavi.com/kadin/sweatshirt/c/1", "kadın", "sweatshirt");
        a.ekle("https://www.mavi.com/kadin/tisort/c/1", "kadın", "tişört");
        a.ekle("https://www.mavi.com/erkek/tisort/c/2", "erkek", "tişört");
     
        a.ekle2("https://www.colins.com.tr/c/erkek-giyim-2", "erkek", "pantolon");
        a.ekle2("https://www.colins.com.tr/c/kadin-giyim-57?specs=96","kadın", "pantolon");
        a.ekle2("https://www.colins.com.tr/c/kadin-gomlek-modelleri-197", "kadın", "gömlek");
        a.ekle2("https://www.colins.com.tr/c/uzun-kol-erkek-gomlek--modelleri-154", "erkek", "gömlek");
        a.ekle2("https://www.colins.com.tr/c/erkek-sweatshirt-177", "erkek", "sweatshirt");
        a.ekle2("https://www.colins.com.tr/c/sweatshirt-189", "kadın", "sweatshirt");
        a.ekle2("https://www.colins.com.tr/c/kadin-tshirt-187", "kadın", "tişört");
       a.ekle2("https://www.colins.com.tr/c/erkek-tshirt-modelleri-172", "erkek", "tişört");
    }
    public void ekle(String link, String cinsiyet, String cins) {
        database_con ekle = new database_con();
        String marka = "mavi";
        try {         
                Document doc = Jsoup.connect(link).get();
                Elements urunler = doc.getElementsByClass("product-item size:small");
                for (int i = 0; i < urunler.size(); i++) {
                    degiskenler urun = new degiskenler();
                    String urun_adi = urunler.get(i).select(".product-title").text();
                    String urun_size = urunler.get(i).select(".product-desc").text();
                    String urun_fiyat = urunler.get(i).select(".product-pricing").text();
                    String urun_resim = urunler.get(i).select(".product-card-images").select("a").get(0).select("img").get(0).attr("abs:src");
                    if (!urun_resim.contains("placeholder.jpg")) {
                       urun.setUrun_adi(urun_adi);
                    urun.setUrun_cins(cins);
                    urun.setUrun_cinsiyet(cinsiyet);
                    urun.setUrun_fiyat(urun_fiyat);
                    urun.setUrun_marka(marka);
                    urun.setUrun_resim(urun_resim);
                    urun.setUrun_size(urun_size);
                    urun.setResim_yol("" + sayac);
                    ekle.insert_urun(urun);
                    sayac++;  
                    }else{
                        System.out.println("hata: "+ urun_adi);
                    }       
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
}
    public void ekle2(String link, String cinsiyet, String cins) {
        database_con ekle2 = new database_con();
        String marka = "colins";
        try {
            String size_dizi[] = {"XSmall", "Small", "Medium", "Large", "XLarge"};
            Document doc = Jsoup.connect(link).get();
            Elements urunlerim = doc.getElementsByClass("col-lg-3 col-md-4 md-4 col-sm-6 col-6 col-mobile-list col-lg-3-x");
            System.out.println(urunlerim.size());
            for (int j = 0; j < urunlerim.size(); j++) {
                Random rastgele = new Random();
                int rastgeleSayi = rastgele.nextInt(5); 
                degiskenler urun = new degiskenler();
                String urun_adi = urunlerim.get(j).select("#name-8margin").text();
                String urun_fiyat = urunlerim.get(j).select(".product-price-content").text();
                String urun_resim = urunlerim.get(j).select("a").select("img").get(2).attr("data-original");
                    urun.setUrun_adi(urun_adi);
                    urun.setUrun_cins(cins);
                    urun.setUrun_cinsiyet(cinsiyet);
                    urun.setUrun_fiyat(urun_fiyat);
                    urun.setUrun_marka(marka);
                    urun.setUrun_resim(urun_resim);
                    urun.setUrun_size(size_dizi[rastgeleSayi]);
                    urun.setResim_yol("" + sayac);
                    ekle2.insert_urun(urun);
                    sayac++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
