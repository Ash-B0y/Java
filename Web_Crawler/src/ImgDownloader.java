import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.net.URL;

public class ImgDownloader {
    private static final String webSiteURL = "https://www.kct.ac.in/";
    private static final String folderPath = "C:\\Users\\Ash\\Documents\\NetBeansProjects\\Web_Crawler\\src\\Crawler";
    public static void main(String[] args)throws IOException {
 
        try {

            Document doc = Jsoup.connect(webSiteURL).get();
            Elements img = doc.getElementsByTag("img");             
            for (Element el : img) {
                String src = el.absUrl("src");
                System.out.println("Image Found!");
                System.out.println("src attribute is : "+src);
                getImages(src);
            }
        } catch (IOException ex) {
            System.err.println("There was an error");
            Logger.getLogger(ImgDownloader.class.getName()).log(Level.SEVERE, null, ex);

        }
    }


    private static void getImages(String src) throws IOException {
                  int b=0;
                  
          int indexname = src.lastIndexOf("/");
    
        if (indexname == src.length()) {
            src = src.substring(1, indexname);
        }

        indexname = src.lastIndexOf("/");
        String name = src.substring(indexname, src.length());
        System.out.println(name);
        URL url = new URL(src);
        InputStream in = url.openStream();
        OutputStream out = new BufferedOutputStream(new FileOutputStream( folderPath+ name));
        while(b!=-1)
         {
             b=in.read(); 
            out.write(b);
        }
        out.close();

    }
}
