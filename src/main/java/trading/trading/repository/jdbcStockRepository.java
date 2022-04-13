package trading.trading.repository;

import trading.trading.domain.Stock;

import java.util.List;
import java.util.Optional;

public class jdbcStockRepository implements StockRepository{
    @Override
    public Stock save(Stock stock) {
        return null;
    }

    @Override
    public Optional<Stock> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Stock> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Stock> findAll() {
        return null;
    }
}
