
package web_crawler;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Web_Crawler {

    
    public static void main(String[] args) throws IOException {
     Document doc= Jsoup.connect("https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/").get();
         String title= doc.title();
         System.out.println("Title:"+" "+title);
         Elements links= doc.select("a[href]");
         Elements media = doc.select("[src]");
         
         for(Element link:links)
         {
             System.out.println("Link:"+" "+link.attr("href"));            
             System.out.println("Text:"+" "+link.text());
         }
         
           System.out.println("Getting all images...");
          
           
           for(Element src:media)
           {
             if (src.tagName().equals("img"))
             System.out.println("Src:"+" "+src.attr("abs:src")+" "+src.tagName()+" "+src.attr("width")+" "+src.attr("height"));  
           }
             
    }
    
}
