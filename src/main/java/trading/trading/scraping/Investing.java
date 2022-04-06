package trading.trading.scraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.ParseException;

public class Investing {
    public static void main(String[] args) throws ParseException {
        String URL = "https://kr.investing.com/equities/south-korea";
        String SELECTOR = "#pair_43413 > td.bold.left.noWrap.elp.plusIconTd > a";
        Document doc;

        try {
            doc = Jsoup.connect(URL).get();
            Elements elem = doc.select(SELECTOR);
            String str = elem.text();

            System.out.println(str);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



}
