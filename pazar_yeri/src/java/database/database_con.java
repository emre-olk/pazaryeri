
package database;
import database.veri_ekle.resim_indir;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import properties.degiskenler;

public class database_con {
    private Connection connection;
    private Statement statement;
    public void connection_open() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pazar_yeri?zeroDateTimeBehavior=convertToNull", "root", "");
                statement = connection.createStatement();
//                System.out.println("Bağlantı Sağlandı");
            } else {
                System.out.println("Bağlantı Zaten Açık");
            }
        } catch (Exception e) {
            System.out.println("Open Connection Error" + e.toString());
        }
    }
    public void conneciton_close() {
        try {
            if (statement != null) {
                statement.close();
                statement = null;
            }
            if (connection != null) {
                connection.close();
                connection = null;
            }
        } catch (Exception e) {
            System.out.println("Exception closeConnection" + e.toString());
        }
    }
    public void insert_urun(degiskenler urun) {
        resim_indir indir = new resim_indir();
        try {
            if (indir.resim_indir(urun.getUrun_resim(), urun.getResim_yol())) {
                connection_open();
                String selectquery = "INSERT INTO `urunler` (`urun_adi`, `urun_size`, `urun_cins`, `urun_fiyat`, `urun_cinsiyet`, `urun_marka`, `urun_resim`, `resim_yol`) VALUES ('" + urun.getUrun_adi()
                        + "', '" + urun.getUrun_size() + "', '" + urun.getUrun_cins() + "', '" + urun.getUrun_fiyat() + "', '" + urun.getUrun_cinsiyet() + "', '" + urun.getUrun_marka() + "'"
                        + ", '" + urun.getUrun_resim() + "', '" + urun.getResim_yol() + ".png');";
                
                statement.executeUpdate(selectquery);
                System.out.println(urun.getUrun_adi() + "  eklendi");
            } else {
                System.out.println(urun.getResim_yol() + " numaralı ürünün resmi eklenmedi.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
    }
    public List<degiskenler> ana_sayfa_urunler_ust(String selectquery) {
        List<degiskenler> urunler = new ArrayList<>();
        try {
            connection_open();
              
            ResultSet rs = statement.executeQuery(selectquery);
            while (rs.next()) {
                degiskenler urun = new degiskenler();
                String urun_id = rs.getString("urun_id");
                String urun_adi = rs.getString("urun_adi");
                String urun_size = rs.getString("urun_size");
                String urun_cins = rs.getString("urun_cins");
                String urun_fiyat = rs.getString("urun_fiyat");
                String urun_cinsiyet = rs.getString("urun_cinsiyet");
                String urun_marka = rs.getString("urun_marka");
                String resim_yol = rs.getString("resim_yol");
                urun.setUrun_id(Integer.parseInt(urun_id));
                urun.setUrun_adi(urun_adi);
                urun.setUrun_size(urun_size);
                urun.setUrun_cins(urun_cins);
                urun.setUrun_fiyat(urun_fiyat);
                urun.setUrun_cinsiyet(urun_cinsiyet);
                urun.setUrun_marka(urun_marka);
                urun.setResim_yol(resim_yol);             
                urunler.add(urun);
            }
            for (int i = 0; i < urunler.size(); i++) {
                System.out.println(urunler.get(i).getUrun_adi());
                System.out.println(urunler.get(i).getResim_yol());
                System.out.println("");
                System.out.println("");
                System.out.println("///////");
                System.out.println("");
                System.out.println("");
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
        return urunler;
    }  
    
}
