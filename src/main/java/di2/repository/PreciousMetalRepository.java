package di2.repository;

import di2.model.Bonds;
import di2.model.MetalType;
import di2.model.PreciousMetal;

import java.util.List;
import java.util.UUID;

public interface PreciousMetalRepository {

    List<PreciousMetal> findAll();

    PreciousMetal findByType(MetalType type);

    PreciousMetal findByUid(UUID uid);

    void save(PreciousMetal preciousMetal);

    void delete(UUID uid);
}
