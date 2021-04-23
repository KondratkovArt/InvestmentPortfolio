package portfolio.repository;


import portfolio.model.Conjuncture;
import portfolio.model.Investment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ConjunctureRepositoryImpl implements ConjunctureRepository {

    private Conjuncture conjuncture = new Conjuncture();

    @Autowired
    private BondsRepository bondsRepository;

    @Autowired
    private DepositRepository depositRepository;

    @Autowired
    private PreciousMetalRepository preciousMetalRepository;

    @Autowired
    private StockRepository stockRepository;


    @PostConstruct
    private void init() {
        List<Investment> investments = new ArrayList<>();

        investments.addAll(bondsRepository.findAll());
        investments.addAll(depositRepository.findAll());
        investments.addAll(preciousMetalRepository.findAll());
        investments.addAll(stockRepository.findAll());

        conjuncture.setNewInvestments(investments);
    }

    @Override
    public Conjuncture getConjuncture() {
        return conjuncture;
    }

    @Override
    public List<Investment> getAllInvestments() {
        return conjuncture.getAvailableInvestments();
    }

    @Override
    public void save(Conjuncture conjuncture) {
        this.conjuncture = conjuncture;
    }

    @Override
    public void delete() {
        this.conjuncture = null;
    }

}
