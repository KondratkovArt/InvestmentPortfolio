package portfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import portfolio.dto.ConjunctureDTO;
import portfolio.model.Bond;
import portfolio.model.Conjuncture;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConjunctureRepository extends CrudRepository<Conjuncture, Integer> {

    Optional<Conjuncture> findByConjuncture_id(Integer id);

    Optional<Conjuncture> findByName(String name);
}
