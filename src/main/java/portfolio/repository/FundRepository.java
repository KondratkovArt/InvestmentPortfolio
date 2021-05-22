package portfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import portfolio.dto.FundDTO;
import portfolio.model.Bond;
import portfolio.model.Conjuncture;
import portfolio.model.Fund;

import java.util.List;
import java.util.UUID;

@Repository
public interface FundRepository extends CrudRepository<Fund, Integer> {

}

