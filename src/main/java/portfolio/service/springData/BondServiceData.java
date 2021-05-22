package portfolio.service.springData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.dto.BondDTO;
import portfolio.model.Bond;
import portfolio.repository.BondRepository;
import portfolio.repository.ConjunctureRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BondServiceData {

    @Autowired
    private BondRepository bondRepository;

    @Autowired
    private ConjunctureRepository conjunctureRepository;

    public void save(BondDTO bondDTO) {
        var conjOptional =
                conjunctureRepository.findByName(bondDTO.getConjunctureDTO().getName());
        conjOptional.ifPresent(conjuncture -> bondRepository.save
                (new Bond(bondDTO.getCost(), bondDTO.getPayment(), bondDTO.getDelayBeforePayment(),
                        bondDTO.getRisk(), bondDTO.getName(), conjuncture)));
    }

    public List<BondDTO> listAll() {
        List<BondDTO> list = new ArrayList<>();
        for(var bond : bondRepository.findAll()) {
            list.add(new BondDTO(bond));
        }
        return list;
    }


    public BondDTO get(Integer id) {
        Optional<Bond> bondOptional = bondRepository.findById(id);

        return bondOptional.map(BondDTO::new).orElse(null);
    }

    public void delete(Integer id) {
        bondRepository.deleteById(id);
    }
}
