package portfolio.repository;

import portfolio.dto.MetalTypeDTO;
import portfolio.dto.PreciousMetalDTO;

import java.util.List;
import java.util.UUID;

public interface PreciousMetalRepository {

    List<PreciousMetalDTO> findAll();

    PreciousMetalDTO findByType(MetalTypeDTO type);

    PreciousMetalDTO findByUid(UUID uid);

    void save(PreciousMetalDTO preciousMetalDTO);

    void delete(UUID uid);
}
