package trading.trading.repository;


import trading.trading.domain.Stock;

import java.util.List;
import java.util.Optional;

public interface StockRepository {
    Stock save(Stock member);
    Optional<Stock> findById(Long id);
    Optional<Stock> findByName(String name);
    List<Stock> findAll();
}
