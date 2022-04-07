package trading.trading.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import trading.trading.domain.Stock;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MemoryStockRepositoryTest {
    MemoryStockRepository repository = new MemoryStockRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

//    @Test
//    public void save() {
//        //given
//        Stock stock = new Stock();
//        stock.setName("spring");
//        //when
//        repository.save(stock);
//        //then
//        Stock result = repository.findById(stock.getId()).get();
//        assertThat(result).isEqualTo(stock);
//    }
//
//    @Test
//    public void findByName() {
//        //given
//        Stock stock1 = new Stock();
//        stock1.setName("spring1");
//        repository.save(stock1);
//        Stock stock2 = new Stock();
//        stock2.setName("spring2");
//        repository.save(stock2);
//        //when
//        Stock result = repository.findByName("spring1").get();
//        //then
//        assertThat(result).isEqualTo(stock1);
//    }
//
//    @Test
//    public void findAll() {
//        //given
//        Stock stock1 = new Stock();
//        stock1.setName("spring1");
//        repository.save(stock1);
//        Stock stock2 = new Stock();
//        stock2.setName("spring2");
//        repository.save(stock2);
//        //when
//        List<Stock> result = repository.findAll();
//        //then
//        assertThat(result.size()).isEqualTo(2);
//    }
}
