package portfolio.repository;

import portfolio.model.MetalType;
import portfolio.model.PreciousMetal;

import java.util.List;
import java.util.UUID;

public interface PreciousMetalRepository {

    List<PreciousMetal> findAll();

    PreciousMetal findByType(MetalType type);

    PreciousMetal findByUid(UUID uid);

    void save(PreciousMetal preciousMetal);

    void delete(UUID uid);
}
