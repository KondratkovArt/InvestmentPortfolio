package portfolio.service.springData;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.dto.*;
import portfolio.model.*;
import portfolio.repository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConjunctureServiceData {

    @Autowired
    private ConjunctureRepository conjunctureRepository;

    @Autowired
    private BondRepository bondRepository;

    @Autowired
    private DepositRepository depositRepository;

    @Autowired
    private PreciousMetalRepository pmRepository;

    @Autowired
    private StockRepository stockRepository;


    public void save(String name) {
        conjunctureRepository.save(new Conjuncture(name));
    }

    public void deleteConjuncture(Integer id) {
        conjunctureRepository.deleteById(id);
    }

    public List<BondDTO> listAllBonds() {
        List<BondDTO> res = new ArrayList<>();

        for (var bond : bondRepository.findAll()) {
            res.add(new BondDTO(bond));
        }
        return res;
    }

    public List<DepositDTO> listAllDeposits() {
        List<DepositDTO> res = new ArrayList<>();

        for (var deposit : depositRepository.findAll()) {
            res.add(new DepositDTO(deposit));
        }
        return res;
    }

    public List<PreciousMetalDTO> listAllPMetals() {
        List<PreciousMetalDTO> res = new ArrayList<>();

        for (var metal : pmRepository.findAll()) {
            res.add(new PreciousMetalDTO(metal));
        }
        return res;
    }

    public List<StockDTO> listAllStocks() {
        List<StockDTO> res = new ArrayList<>();

        for (var stock : stockRepository.findAll()) {
            res.add(new StockDTO(stock));
        }
        return res;
    }

    public BondDTO getBond(Integer id) {

        Optional<Bond> bondOptional = bondRepository.findById(id);

        return bondOptional.map(BondDTO::new).orElse(null);
    }

    public DepositDTO getDeposit(Integer id) {

        Optional<Deposit> depositOptional = depositRepository.findById(id);

        return depositOptional.map(DepositDTO::new).orElse(null);
    }

    public PreciousMetalDTO getPreciousMetal(Integer id) {

        Optional<PreciousMetal> pmOptional = pmRepository.findById(id);

        return pmOptional.map(PreciousMetalDTO::new).orElse(null);
    }

    public StockDTO getStock(Integer id) {

        Optional<Stock> stockOptional = stockRepository.findById(id);

        return stockOptional.map(StockDTO::new).orElse(null);
    }

    public void addBondToConjuncture(Integer id, BondDTO bondDTO) {
        var conjuncture = conjunctureRepository.findById(id);

        conjuncture.ifPresent(value -> conjunctureRepository.save(new Bond(
                bondDTO.getCost(), bondDTO.getPayment(), bondDTO.getDelayBeforePayment(),
                bondDTO.getRisk(), bondDTO.getName(), conjuncture.get())));
    }

}
