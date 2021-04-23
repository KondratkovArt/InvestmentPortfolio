package portfolio.repository;

import portfolio.model.Deposit;

import java.util.List;
import java.util.UUID;

public interface DepositRepository {

    List<Deposit> findAll();

    Deposit findByName(String name);

    Deposit findByUid(UUID uid);

    void save(Deposit deposit);

    void delete(UUID uid);

}
