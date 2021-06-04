package portfolio.service.springJPA;

import org.springframework.stereotype.Service;
import portfolio.dto.BondDTO;
import portfolio.dto.ConjunctureDTO;
import portfolio.model.Bond;
import portfolio.model.Conjuncture;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class ConjunctureServiceJPA {

    @PersistenceContext
    private EntityManager em;


    public void save(ConjunctureDTO conjunctureDTO) {
        em.persist(new Conjuncture(conjunctureDTO.getName()));
    }

    public void deleteConjuncture(Integer id) {
        Conjuncture conjuncture = em.find(Conjuncture.class, id);
        if (conjuncture != null)
            em.remove(conjuncture);
    }

    public void addBondToConjuncture(Integer id, BondDTO bondDto) {
        Conjuncture conjuncture = em.find(Conjuncture.class, id);
        if (conjuncture != null) {
            em.persist(new Bond(
                    bondDto.getCost(), bondDto.getPayment(),
                    bondDto.getDelayBeforePayment(), bondDto.getRisk(),
                    bondDto.getName(), conjuncture));
        }
    }

    public BondDTO getBond(Integer id) {
        Bond bond = em.find(Bond.class, id);
        return bond != null ? new BondDTO(bond) : null;
    }

    public void deleteBond(Integer id) {
        Bond bond = em.find(Bond.class, id);
        if(bond != null)
            em.remove(bond);
    }

    public List<BondDTO> getAllBonds(String conjunctureName) {

        TypedQuery<Conjuncture> conjunctureTypedQuery = em.createQuery(
                "select conjuncture from Conjuncture conjuncture where conjuncture.name = :name", Conjuncture.class).
                setParameter("name", conjunctureName);
        Conjuncture conjuncture = conjunctureTypedQuery.getSingleResult();
        List<BondDTO> res = new ArrayList<>();
        if (conjuncture != null) {
            for (var bond : conjuncture.getBonds())
                res.add(new BondDTO(bond));
        }
        return res;
    }

}
