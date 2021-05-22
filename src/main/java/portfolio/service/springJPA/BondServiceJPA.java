package portfolio.service.springJPA;

import org.springframework.stereotype.Service;
import portfolio.dto.BondDTO;
import portfolio.model.Bond;
import portfolio.model.Conjuncture;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BondServiceJPA {

    @PersistenceContext
    private EntityManager em;

    private void save(BondDTO bondDTO) {
        TypedQuery<Conjuncture> conjunctureTypedQuery = em.createQuery(
                "select conjuncture from Conjuncture conjuncture where conjuncture.name = :name", Conjuncture.class).
                setParameter("name", bondDTO.getConjunctureDTO().getName());
        Conjuncture conjuncture = conjunctureTypedQuery.getSingleResult();
        em.persist(new Bond(bondDTO.getCost(), bondDTO.getPayment(), bondDTO.getDelayBeforePayment(),
                bondDTO.getRisk(), bondDTO.getName(), conjuncture));
    }

    private List<BondDTO> listAll() {
        List<BondDTO> bondDTOS = new ArrayList<>();
        TypedQuery<Bond> bonds = em.createQuery("select bond from Bond bond", Bond.class);
        for (var bond: bonds.getResultList()) {
            bondDTOS.add(new BondDTO(bond));
        }
        return bondDTOS;
    }

    private BondDTO get(Integer id) {
        Bond bond = em.find(Bond.class, id);
        return bond != null ? new BondDTO(bond) : null;
    }

    public void delete(Integer id) {
        Bond bond = em.find(Bond.class, id);
        if(bond != null)
            em.remove(bond);
    }

}
