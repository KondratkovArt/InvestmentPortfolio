package portfolio.repository;

import portfolio.model.Fund;
import portfolio.model.Investment;

import java.util.List;
import java.util.UUID;

public interface FundRepository {

    List<Investment> findAllInvestments();

    Investment findByUid(UUID uid);

    void save(Fund fund);

    void delete();
}
