package trading.trading.repository;

import trading.trading.domain.Stock;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class JdbcStockRepository implements StockRepository{


    public JdbcStockRepository(DataSource dataSource) {

    }

    @Override
    public Stock save(Stock stock) {
        return null;
    }

    @Override
    public Optional<Stock> findById(String id) {
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
