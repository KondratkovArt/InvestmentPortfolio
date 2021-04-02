package di2.repository;

import di2.model.Bonds;

import java.util.List;
import java.util.UUID;

public interface BondsRepository {

    List<Bonds> findAll();

    Bonds findByName(String name);

    Bonds findByUid(UUID uid);

    void save(Bonds b);

    void delete(UUID uid);

}
