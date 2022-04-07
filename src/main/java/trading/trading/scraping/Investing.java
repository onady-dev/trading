package trading.trading.scraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import trading.trading.domain.Stock;
import trading.trading.repository.MemoryStockRepository;

import java.io.IOException;


public class Investing {
    public static void main(String[] args) {
        MemoryStockRepository repository = new MemoryStockRepository();

        String URL = "https://kr.investing.com/equities/south-korea";
        Document doc;
        try {
            doc = Jsoup.connect(URL).get();
            Elements elememts = doc.select("#cross_rate_markets_stocks_1 > tbody > tr");
            for(Element e: elememts){
                String name = e.text().split(" ")[0];
                String last = e.text().split(" ")[1];
                String high = e.text().split(" ")[2];
                String low = e.text().split(" ")[3];
                String pc = e.text().split(" ")[4];
                String pcp = e.text().split(" ")[5];
                String turnover = e.text().split(" ")[6];
                String time = e.text().split(" ")[7];

                Stock stock = new Stock(name, last, high, low, pc, pcp, turnover, time);
                repository.save(stock);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for(Stock s:repository.findAll()){
            System.out.println(s.toString());
        }
    }

//    public static int strNumToint(String number, String replaceStr) {
//        return Integer.parseInt(number.replace(replaceStr,""));
//    }
//
//    public static double doubleToint(String number) {
//        double unitNum = 1.0;
//        if(number.substring(number.length() - 1).equals("K")){
//            number = number.replace("K","");
//            unitNum = 1000.0;
//        }else if(number.substring(number.length() - 1).equals("M")){
//            number = number.replace("M","");
//            unitNum = 1000000.0;
//        }
//        return Double.parseDouble(number) * unitNum;
//    }

}
