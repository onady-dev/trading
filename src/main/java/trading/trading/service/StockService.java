package trading.trading.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trading.trading.domain.Stock;
import trading.trading.repository.StockRepository;

import java.util.List;
import java.util.Optional;


public class StockService {
    // 테스트파일 생성 단축키 커맨드+쉬프트+n
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    /*
        주식 종목 데이터 저장
    */
    public String save(Stock stock) {
        stockRepository.save(stock);
        return stock.getName();
    }

    /*
        전체 종목 데이터 조회
    */
    public List<Stock> findStocks() {
        return stockRepository.findAll();
    }

    /*
        종목 데이터 조회
    */
    public Optional<Stock> findOne(Long stockId) {
        return stockRepository.findById(stockId);
    }
}
