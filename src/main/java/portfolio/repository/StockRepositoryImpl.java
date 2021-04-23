package portfolio.repository;

import portfolio.model.Stock;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StockRepositoryImpl implements StockRepository{

    private List<Stock> stocks = new ArrayList<>();


    @PostConstruct
    private void init(){
        stocks.add(new Stock("stock1", 1000, 5, 1200));
        stocks.add(new Stock("stock2", 1500, 8, 2100));
        stocks.add(new Stock("stock3", 500, 3, 700));
    }

    @Override
    public List<Stock> findAll() {
        return stocks;
    }

    @Override
    public Stock findByName(String name) {
        for (int i = 0; i < stocks.size(); i++) {
            if (stocks.get(i).getName().equals(name)) return stocks.get(i);
        }
        return null;
    }

    @Override
    public Stock findByUid(UUID uid) {
        for (int i = 0; i < stocks.size(); i++) {
            if (stocks.get(i).getUid().equals(uid)) return stocks.get(i);
        }
        return null;
    }

    @Override
    public void save(Stock stock) {
        stocks.add(stock);
    }

    @Override
    public void delete(UUID uid) {
        stocks.remove(findByUid(uid));
    }

}
