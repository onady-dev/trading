package trading.trading.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import trading.trading.domain.Stock;
import trading.trading.repository.MemoryStockRepository;
import trading.trading.service.StockService;

import java.io.IOException;
import java.util.List;

@Controller
public class StockController {

    private final StockService stockService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/stocks/new")
    public String createForm() {
        return "stocks/createStock";
    }

    @PostMapping("/stocks/new")
    public String create(){
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

                Stock stock = new Stock(name, last, high, low, pc, pcp, turnover, time);
                repository.save(stock);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "redirect:/";
    }

    @GetMapping("/stocks")
    public String list(Model model){
        List<Stock> stocks = stockService.findStocks();
        model.addAttribute("stocks", stocks);
        return "stocks/stockList";
    }

}
