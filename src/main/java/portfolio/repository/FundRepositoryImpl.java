package portfolio.repository;

import portfolio.dto.FundDTO;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;

public class FundRepositoryImpl implements FundRepository {

    private FundDTO fund;


    @PostConstruct
    private void init() {
        fund = new FundDTO(15000);
    }

    @Override
    public List<Investment> findAllInvestments() {
        return fund.getInvestmentList();
    }

    @Override
    public Investment findByUid(UUID uid) {
        List<Investment> inv = fund.getInvestmentList();
        for (int i = 0; i < inv.size(); i++) {
            if (inv.get(i).getUid().equals(uid)) return inv.get(0);
        }
        return null;
    }

    @Override
    public void save(FundDTO fund) {
        this.fund = fund;
    }

    @Override
    public void delete() {
        fund = null;
    }
}
