package di2.repository;

import di2.model.Bonds;
import di2.model.Deposit;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DepositRepositoryImpl implements DepositRepository {

    private List<Deposit> deposits = new ArrayList<>();


    @PostConstruct
    private void init(){
        deposits.add(new Deposit("deposit1", 7, 15, 2));
        deposits.add(new Deposit("deposit2", 3, 20, 10));
    }

    @Override
    public List<Deposit> findAll() {
        return deposits;
    }

    @Override
    public Deposit findByName(String name) {
        for (int i = 0; i < deposits.size(); i++) {
            if (deposits.get(i).getName().equals(name)) return deposits.get(i);
        }
        return null;
    }

    @Override
    public Deposit findByUid(UUID uid) {
        for (int i = 0; i < deposits.size(); i++) {
            if (deposits.get(i).getUid().equals(uid)) return deposits.get(i);
        }
        return null;
    }

    @Override
    public void save(Deposit deposit) {
        deposits.add(deposit);
    }

    @Override
    public void delete(UUID uid) {
        deposits.remove(findByUid(uid));
    }
}
