package portfolio.service.springJPA;

import org.springframework.stereotype.Service;
import portfolio.dto.ConjunctureDTO;
import portfolio.dto.FundDTO;
import portfolio.model.Bond;
import portfolio.model.Conjuncture;
import portfolio.model.Fund;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class FundServiceJPA {

    @PersistenceContext
    private EntityManager em;

    public void save(FundDTO fundDTO) {
        em.persist(new Fund(fundDTO.getCapital(), fundDTO.getProfit(),
                new Conjuncture(fundDTO.getConjunctureDTO().getName())));
    }

    public void deleteFund(Integer id) {
        Fund fund = em.find(Fund.class, id);
        if (fund != null)
            em.remove(fund);
    }

    public void updateCapital(Integer id, Double capital) {

        Fund fund = em.find(Fund.class, id);
        if (fund != null) {
            fund.setCapital(capital);
            em.persist(fund);
        }
    }

    public void buyBond(Integer fundId, Integer bondId) {

        Fund fund = em.find(Fund.class, fundId);
        if (fund != null) {
            TypedQuery<Conjuncture> conjunctureQuery = em.createQuery(
                    "select conjuncture from Conjuncture conjuncture where conjuncture.conjuncture_id = :id", Conjuncture.class).
                    setParameter("id", fund.getConjuncture().getConjuncture_id());
            Conjuncture conjuncture = conjunctureQuery.getSingleResult();
            if (conjuncture != null) {
                TypedQuery<Bond> bondQuery = em.createQuery(
                        "select bond from Bond bond where bond.bond_id = :id", Bond.class).
                        setParameter("id", bondId);
                Bond bond = bondQuery.getSingleResult();
                if (bond != null) {
                    fund.getBonds().forEach(b -> {
                        if (bond.getName().equals(b.getName())) {
                            return;
                        }
                    });
                    List<Bond> bonds = fund.getBonds();
                    bonds.add(bond);
                    fund.setBonds(bonds);
                    updateCapital(fund.getFund_id(), bond.getCost());
                    em.persist(fund);
                }
            }
        }
    }


}
