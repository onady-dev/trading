package trading.trading.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import trading.trading.domain.Stock;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class JdbcTemplateStockRepository implements StockRepository{

    private final JdbcTemplate jdbcTemplate;

    // 생성자가 1개인경우 @Autowired 생략 가능
//    @Autowired
    public JdbcTemplateStockRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
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
