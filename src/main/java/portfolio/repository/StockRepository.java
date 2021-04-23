package portfolio.repository;

import portfolio.model.Stock;

import java.util.List;
import java.util.UUID;

public interface StockRepository {

    List<Stock> findAll();

    Stock findByName(String name);

    Stock findByUid(UUID uid);

    void save(Stock stock);

    void delete(UUID uid);
}
