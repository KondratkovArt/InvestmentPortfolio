package di2.repository;

import di2.model.Bonds;
import di2.model.Fund;
import di2.model.Investment;

import java.util.List;
import java.util.UUID;

public interface FundRepository {

    List<Investment> findAllInvestments();

    Investment findByUid(UUID uid);

    void save(Fund fund);

    void delete();
}
