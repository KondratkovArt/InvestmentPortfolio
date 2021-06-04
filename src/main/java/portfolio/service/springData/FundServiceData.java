package portfolio.service.springData;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.model.Bond;
import portfolio.model.Conjuncture;
import portfolio.model.Fund;
import portfolio.repository.*;

import java.util.List;

@Service
public class FundServiceData {

    @Autowired
    private FundRepository fundRepository;

    @Autowired
    private BondRepository bondRepository;

    @Autowired
    private DepositRepository depositRepository;

    @Autowired
    private PreciousMetalRepository pmRepository;

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private ConjunctureRepository conjunctureRepository;

    public void save(Double capital, Double profit, Conjuncture conjuncture) {
        fundRepository.save(new Fund(capital, profit, conjuncture));
    }

    public void deleteFund(Integer id) {
        fundRepository.deleteById(id);
    }

    public void updateCapital(Integer fundId, Double newCapital) {
        var fundOptional = fundRepository.findById(fundId);
        if (fundOptional.isPresent()) {
            var fund = fundOptional.get();
            fund.setCapital(newCapital);
            fundRepository.save(fund);
        }
    }

    public void buyBond(Integer fundId, Integer bondId) {
        var fundOptional = fundRepository.findById(fundId);
        if (fundOptional.isPresent()) {
            var fund = fundOptional.get();
            var conjunctureOpt =
                    conjunctureRepository.findById(fund.getConjuncture().getConjuncture_id());
            if (conjunctureOpt.isPresent()) {
                var conjuncture = conjunctureOpt.get();
                var bondOpt = bondRepository.findById(bondId);
                if (bondOpt.isPresent()) {
                    var bond = bondOpt.get();
                    if (bond.getConjuncture().getConjuncture_id() == conjuncture.getConjuncture_id()) {
                        List<Bond> fundBonds = fund.getBonds();
                        fundBonds.add(bond);
                        fund.setBonds(fundBonds);
                        Double newCapital = fund.getCapital() - bond.getCost();
                        updateCapital(fund.getFund_id(), newCapital);
                        fundRepository.save(fund);
                    }
                }
            }
        }
    }

}
