package portfolio.repository;


import portfolio.dto.BondDTO;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class BondsRepositoryImpl implements BondsRepository{

    private List<BondDTO> bonds = new ArrayList<>();


    @PostConstruct
    private void init(){
        bonds.add(new BondDTO("Bond1", 1500, 4, 5, 2500));
        bonds.add(new BondDTO("Bond2", 2500, 5, 2, 3000));
        bonds.add(new BondDTO("Bond3", 1000, 3, 20, 7000));
    }

    @Override
    public List<BondDTO> findAll() {
        return bonds;
    }

    @Override
    public BondDTO findByName(String name) {
        for (int i = 0; i < bonds.size(); i++) {
            if (bonds.get(i).getName().equals(name)) return bonds.get(i);
        }
        return null;
    }

    @Override
    public BondDTO findByUid(UUID uid) {
        for (int i = 0; i < bonds.size(); i++) {
            if (bonds.get(i).getUid().equals(uid)) return bonds.get(i);
        }
        return null;
    }

    @Override
    public void save(BondDTO b) {
        bonds.add(b);
    }

    @Override
    public void delete(UUID uid) {
        bonds.remove(findByUid(uid));
    }
}
