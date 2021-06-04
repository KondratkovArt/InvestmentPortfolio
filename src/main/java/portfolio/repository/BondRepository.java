package portfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import portfolio.model.Bond;
import portfolio.model.Conjuncture;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BondRepository extends CrudRepository<Bond, Integer> {

    List<Bond> findByConjuncture(Conjuncture conjuncture);

    Optional<Bond> findByName(String name);
}
