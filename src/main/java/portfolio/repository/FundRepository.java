package portfolio.repository;

import portfolio.dto.FundDTO;

import java.util.List;
import java.util.UUID;

public interface FundRepository {

    List<Investment> findAllInvestments();

    Investment findByUid(UUID uid);

    void save(FundDTO fund);

    void delete();
}
