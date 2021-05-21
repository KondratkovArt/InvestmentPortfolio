package portfolio.repository;

import portfolio.dto.MetalTypeDTO;
import portfolio.dto.PreciousMetalDTO;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PreciousRepositoryImpl implements PreciousMetalRepository{

    private List<PreciousMetalDTO> metals = new ArrayList<>();


    @PostConstruct
    private void init(){
        metals.add(new PreciousMetalDTO(MetalTypeDTO.GOLD, 1200, 7));
        metals.add(new PreciousMetalDTO(MetalTypeDTO.PLATINUM, 2000, 10));
        metals.add(new PreciousMetalDTO(MetalTypeDTO.SILVER, 700, 5));
    }

    @Override
    public List<PreciousMetalDTO> findAll() {
        return metals;
    }

    @Override
    public PreciousMetalDTO findByType(MetalTypeDTO type) {
        for (int i = 0; i < metals.size(); i++) {
            if (metals.get(i).getType().equals(type)) return metals.get(i);
        }
        return null;
    }

    @Override
    public PreciousMetalDTO findByUid(UUID uid) {
        for (int i = 0; i < metals.size(); i++) {
            if (metals.get(i).getUid().equals(uid)) return metals.get(i);
        }
        return null;
    }

    @Override
    public void save(PreciousMetalDTO preciousMetalDTO) {
        metals.add(preciousMetalDTO);
    }


    @Override
    public void delete(UUID uid) {
        metals.remove(findByUid(uid));
    }
}
