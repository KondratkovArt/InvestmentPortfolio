package di2.repository;

import di2.model.Bonds;
import di2.model.MetalType;
import di2.model.PreciousMetal;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PreciousRepositoryImpl implements PreciousMetalRepository{

    private List<PreciousMetal> metals = new ArrayList<>();


    @PostConstruct
    private void init(){
        metals.add(new PreciousMetal(MetalType.GOLD, 1200, 7));
        metals.add(new PreciousMetal(MetalType.PLATINUM, 2000, 10));
        metals.add(new PreciousMetal(MetalType.SILVER, 700, 5));
    }

    @Override
    public List<PreciousMetal> findAll() {
        return metals;
    }

    @Override
    public PreciousMetal findByType(MetalType type) {
        for (int i = 0; i < metals.size(); i++) {
            if (metals.get(i).getType().equals(type)) return metals.get(i);
        }
        return null;
    }

    @Override
    public PreciousMetal findByUid(UUID uid) {
        for (int i = 0; i < metals.size(); i++) {
            if (metals.get(i).getUid().equals(uid)) return metals.get(i);
        }
        return null;
    }

    @Override
    public void save(PreciousMetal preciousMetal) {
        metals.add(preciousMetal);
    }


    @Override
    public void delete(UUID uid) {
        metals.remove(findByUid(uid));
    }
}
