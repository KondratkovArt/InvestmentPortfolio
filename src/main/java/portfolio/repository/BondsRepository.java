package portfolio.repository;

import portfolio.dto.BondDTO;

import java.util.List;
import java.util.UUID;

public interface BondsRepository {

    List<BondDTO> findAll();

    BondDTO findByName(String name);

    BondDTO findByUid(UUID uid);

    void save(BondDTO b);

    void delete(UUID uid);

}
