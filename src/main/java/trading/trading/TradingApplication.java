package trading.trading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import trading.trading.domain.Stock;
import trading.trading.repository.MemoryStockRepository;

import java.io.IOException;

@SpringBootApplication
public class TradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingApplication.class, args);

		MemoryStockRepository repository = new MemoryStockRepository();

		String URL = "https://kr.investing.com/equities/south-korea";
		Document doc;
		try {
			doc = Jsoup.connect(URL).get();
			Elements elememts = doc.select("#cross_rate_markets_stocks_1 > tbody > tr");
			for (Element e : elememts) {
				String name = e.text().split(" ")[0];
				String last = e.text().split(" ")[1];
				String high = e.text().split(" ")[2];
				String low = e.text().split(" ")[3];
				String pc = e.text().split(" ")[4];
				String pcp = e.text().split(" ")[5];
				String turnover = e.text().split(" ")[6];
				String time = e.text().split(" ")[7];

				Stock stock = new Stock();
				stock.setName(name);
				stock.setLast(last);
				stock.setHigh(high);
				stock.setLow(low);
				stock.setPc(pc);
				stock.setPcp(pcp);
				stock.setTurnover(turnover);
				stock.setTime(time);
				repository.save(stock);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
