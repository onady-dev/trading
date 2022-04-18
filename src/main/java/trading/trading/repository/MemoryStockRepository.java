package trading.trading.repository;

import org.springframework.stereotype.Repository;
import trading.trading.domain.Stock;

import java.util.*;


public class MemoryStockRepository implements StockRepository {

    private static Map<Long, Stock> store = new HashMap<>();
    private static Long sequence = 0L;

    @Override
    public Stock save(Stock stock) {
        stock.setId(++sequence);
        store.put(stock.getId(), stock);
        return stock;
    }

    @Override
    public Optional<Stock> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Stock> findByName(String name) {
        return store.values().stream()
                .filter(stock -> stock.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Stock> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }

}
