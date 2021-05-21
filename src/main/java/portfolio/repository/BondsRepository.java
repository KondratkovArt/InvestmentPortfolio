package portfolio.repository;

import portfolio.dto.BondsDTO;

import java.util.List;
import java.util.UUID;

public interface BondsRepository {

    List<BondsDTO> findAll();

    BondsDTO findByName(String name);

    BondsDTO findByUid(UUID uid);

    void save(BondsDTO b);

    void delete(UUID uid);

}
