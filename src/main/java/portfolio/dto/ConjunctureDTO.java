package portfolio.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ConjunctureDTO {

    private List<BondDTO> bonds;
    private List<DepositDTO> deposits;
    private List<PreciousMetalDTO> metals;
    private List<StockDTO> stocks;

    public ConjunctureDTO(List<BondDTO> bonds, List<DepositDTO> deposits, List<PreciousMetalDTO> metals, List<StockDTO> stocks) {
        this.bonds = bonds;
        this.deposits = deposits;
        this.metals = metals;
        this.stocks = stocks;
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
