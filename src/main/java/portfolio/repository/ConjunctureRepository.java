package portfolio.repository;

import portfolio.model.Conjuncture;
import portfolio.model.Investment;

import java.util.List;

public interface ConjunctureRepository {

    Conjuncture getConjuncture();

    List<Investment> getAllInvestments();

    void save(Conjuncture conjuncture);

    void delete();


}
