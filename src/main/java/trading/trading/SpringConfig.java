package trading.trading;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import trading.trading.repository.MemoryStockRepository;
import trading.trading.repository.StockRepository;
import trading.trading.service.StockService;

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
