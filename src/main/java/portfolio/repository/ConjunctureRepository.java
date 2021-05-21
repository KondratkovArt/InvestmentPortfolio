package portfolio.repository;

import portfolio.dto.ConjunctureDTO;

import java.util.List;

public interface ConjunctureRepository {

    ConjunctureDTO getConjuncture();

    List<Investment> getAllInvestments();

    void save(ConjunctureDTO conjuncture);

    void delete();


}
