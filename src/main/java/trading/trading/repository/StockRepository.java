package trading.trading.repository;


import trading.trading.domain.Stock;

import java.util.List;
import java.util.Optional;

//@Repository
public interface StockRepository {
    Stock save(Stock stock);
    Optional<Stock> findById(String id);
    Optional<Stock> findByName(String name);
    List<Stock> findAll();

}
