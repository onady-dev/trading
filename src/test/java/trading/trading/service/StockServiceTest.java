package trading.trading.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import trading.trading.domain.Stock;
import trading.trading.repository.MemoryStockRepository;
import trading.trading.repository.StockRepository;
import static org.assertj.core.api.Assertions.assertThat;

public class StockServiceTest {

    StockService stockService;
    StockRepository stockRepository;
    @BeforeEach
    public void beforeEach() {
        stockRepository = new MemoryStockRepository();
        stockService = new StockService(stockRepository);
    }
//    @AfterEach
//    public void afterEach() {
//        stockRepository.clearStore();
//    }
    @Test
    void 주식등록(){
        //given
        Stock stock = new Stock();
        stock.setName("stock");
        //when
        String stockName = stockService.save(stock);
        //then
        assertThat("stock").isEqualTo(stockName);
    }

}
