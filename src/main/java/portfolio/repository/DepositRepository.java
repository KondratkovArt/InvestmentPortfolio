package portfolio.repository;

import portfolio.dto.DepositDTO;

import java.util.List;
import java.util.UUID;

public interface DepositRepository {

    List<DepositDTO> findAll();

    DepositDTO findByName(String name);

    DepositDTO findByUid(UUID uid);

    void save(DepositDTO depositDTO);

    void delete(UUID uid);

}
