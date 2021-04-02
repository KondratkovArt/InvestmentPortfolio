package di2.repository;

import di2.model.Conjuncture;
import di2.model.Investment;

import java.util.List;

public interface ConjunctureRepository {

    Conjuncture getConjuncture();

    List<Investment> getAllInvestments();

    void save(Conjuncture conjuncture);

    void delete();


}
