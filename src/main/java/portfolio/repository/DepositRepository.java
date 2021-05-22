package portfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import portfolio.dto.DepositDTO;
import portfolio.model.Bond;
import portfolio.model.Conjuncture;
import portfolio.model.Deposit;

import java.util.List;
import java.util.UUID;

@Repository
public interface DepositRepository extends CrudRepository<Deposit, Integer> {

    List<Deposit> findByConjuncture(Conjuncture conjuncture);

}