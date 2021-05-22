package portfolio.dto;

import portfolio.model.Conjuncture;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ConjunctureDTO {

    private String name;

    private List<BondDTO> bonds;
    private List<DepositDTO> deposits;
    private List<PreciousMetalDTO> metals;
    private List<StockDTO> stocks;

    public ConjunctureDTO(String name, List<BondDTO> bonds, List<DepositDTO> deposits, List<PreciousMetalDTO> metals, List<StockDTO> stocks) {
        this.name = name;
        this.bonds = bonds;
        this.deposits = deposits;
        this.metals = metals;
        this.stocks = stocks;
    }

    public ConjunctureDTO(Conjuncture conjuncture) {
        this.name = conjuncture.getName();

        List<BondDTO> bondDTOs = new ArrayList<>();
        for (var bond : conjuncture.getBonds()) {
            bondDTOs.add(new BondDTO(bond));
        }
        this.bonds = bondDTOs;

        List<DepositDTO> depositDTOs = new ArrayList<>();
        for (var deposit : conjuncture.getDeposits()) {
            depositDTOs.add(new DepositDTO(deposit));
        }
        this.deposits = depositDTOs;

        List<PreciousMetalDTO> pmDTOs = new ArrayList<>();
        for (var pm : conjuncture.getPreciousMetals()) {
            pmDTOs.add(new PreciousMetalDTO(pm));
        }
        this.metals = pmDTOs;

        List<StockDTO> stockDTOs = new ArrayList<>();
        for (var stock : conjuncture.getStocks()) {
            stockDTOs.add(new StockDTO(stock));
        }
        this.stocks = stockDTOs;

    }

    public List<BondDTO> getBonds() {
        return bonds;
    }

    public void setBonds(List<BondDTO> bonds) {
        this.bonds = bonds;
    }

    public List<DepositDTO> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<DepositDTO> deposits) {
        this.deposits = deposits;
    }

    public List<PreciousMetalDTO> getMetals() {
        return metals;
    }

    public void setMetals(List<PreciousMetalDTO> metals) {
        this.metals = metals;
    }

    public List<StockDTO> getStocks() {
        return stocks;
    }

    public void setStocks(List<StockDTO> stocks) {
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConjunctureDTO{" +
                "bonds=" + bonds +
                ", deposits=" + deposits +
                ", metals=" + metals +
                ", stocks=" + stocks +
                '}';
    }
}
