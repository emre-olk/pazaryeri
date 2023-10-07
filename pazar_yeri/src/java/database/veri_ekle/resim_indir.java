package database.veri_ekle;



import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;


public class resim_indir {

    public static void main(String[] args) {
        resim_indir aa = new resim_indir();
    }
    public boolean resim_indir(String link, String resim_location) {
        boolean kontrol = false;
        BufferedImage image = null;
        try {       
            URL url = new URL(link);
            System.out.println(url);
            image = ImageIO.read(url);
            ImageIO.write(image, "png", new File("C:\\Users\\sabah\\Documents\\NetBeansProjects\\pazar_yeri\\web\\urun_images\\" + resim_location + ".png"));
            kontrol = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return kontrol;
    }

}
