package trading.trading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import trading.trading.repository.MemoryStockRepository;
import trading.trading.repository.StockRepository;
import trading.trading.service.StockService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public StockService stockService() {
        return new StockService(stockRepository());
    }
    @Bean
    public StockRepository stockRepository() {
        return new MemoryStockRepository();
    }
}
