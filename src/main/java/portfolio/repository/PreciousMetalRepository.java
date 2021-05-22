package portfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import portfolio.dto.MetalTypeDTO;
import portfolio.dto.PreciousMetalDTO;
import portfolio.model.Bond;
import portfolio.model.Conjuncture;
import portfolio.model.PreciousMetal;

import java.util.List;
import java.util.UUID;

@Repository
public interface PreciousMetalRepository extends CrudRepository<PreciousMetal, Integer> {

    List<PreciousMetal> findByConjuncture(Conjuncture conjuncture);

}