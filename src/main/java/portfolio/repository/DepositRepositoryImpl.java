package portfolio.repository;

import portfolio.dto.DepositDTO;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DepositRepositoryImpl implements DepositRepository {

    private List<DepositDTO> depositDTOS = new ArrayList<>();


    @PostConstruct
    private void init(){
        depositDTOS.add(new DepositDTO("deposit1", 7, 15, 2));
        depositDTOS.add(new DepositDTO("deposit2", 3, 20, 10));
    }

    @Override
    public List<DepositDTO> findAll() {
        return depositDTOS;
    }

    @Override
    public DepositDTO findByName(String name) {
        for (int i = 0; i < depositDTOS.size(); i++) {
            if (depositDTOS.get(i).getName().equals(name)) return depositDTOS.get(i);
        }
        return null;
    }

    @Override
    public DepositDTO findByUid(UUID uid) {
        for (int i = 0; i < depositDTOS.size(); i++) {
            if (depositDTOS.get(i).getUid().equals(uid)) return depositDTOS.get(i);
        }
        return null;
    }

    @Override
    public void save(DepositDTO depositDTO) {
        depositDTOS.add(depositDTO);
    }

    @Override
    public void delete(UUID uid) {
        depositDTOS.remove(findByUid(uid));
    }
}
