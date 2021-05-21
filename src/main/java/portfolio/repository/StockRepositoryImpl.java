package portfolio.repository;

import portfolio.dto.StockDTO;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StockRepositoryImpl implements StockRepository{

    private List<StockDTO> stockDTOS = new ArrayList<>();


    @PostConstruct
    private void init(){
        stockDTOS.add(new StockDTO("stock1", 1000, 5, 1200));
        stockDTOS.add(new StockDTO("stock2", 1500, 8, 2100));
        stockDTOS.add(new StockDTO("stock3", 500, 3, 700));
    }

    @Override
    public List<StockDTO> findAll() {
        return stockDTOS;
    }

    @Override
    public StockDTO findByName(String name) {
        for (int i = 0; i < stockDTOS.size(); i++) {
            if (stockDTOS.get(i).getName().equals(name)) return stockDTOS.get(i);
        }
        return null;
    }

    @Override
    public StockDTO findByUid(UUID uid) {
        for (int i = 0; i < stockDTOS.size(); i++) {
            if (stockDTOS.get(i).getUid().equals(uid)) return stockDTOS.get(i);
        }
        return null;
    }

    @Override
    public void save(StockDTO stockDTO) {
        stockDTOS.add(stockDTO);
    }

    @Override
    public void delete(UUID uid) {
        stockDTOS.remove(findByUid(uid));
    }

}
