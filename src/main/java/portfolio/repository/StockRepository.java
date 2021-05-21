package portfolio.repository;

import portfolio.dto.StockDTO;

import java.util.List;
import java.util.UUID;

public interface StockRepository {

    List<StockDTO> findAll();

    StockDTO findByName(String name);

    StockDTO findByUid(UUID uid);

    void save(StockDTO stockDTO);

    void delete(UUID uid);
}
