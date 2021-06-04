package portfolio.model;


import portfolio.dto.BondDTO;
import portfolio.dto.DepositDTO;
import portfolio.dto.PreciousMetalDTO;
import portfolio.dto.StockDTO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "conjuncture")
public class Conjuncture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer conjuncture_id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "conjuncture")
    private List<Bond> bonds;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "conjuncture")
    private List<Deposit> deposits;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "conjuncture")
    private List<PreciousMetal> preciousMetals;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "conjuncture")
    private List<Stock> stocks;

    public Conjuncture(String name) {
        this.name = name;
    }

    public List<Bond> getBonds() {
        return bonds;
    }

    public void setBonds(List<Bond> bonds) {
        this.bonds = bonds;
    }

    public List<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<Deposit> deposits) {
        this.deposits = deposits;
    }

    public List<PreciousMetal> getPreciousMetals() {
        return preciousMetals;
    }

    public void setPreciousMetals(List<PreciousMetal> preciousMetals) {
        this.preciousMetals = preciousMetals;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public Integer getConjuncture_id() {
        return conjuncture_id;
    }

    public void setConjuncture_id(Integer conjuncture_id) {
        this.conjuncture_id = conjuncture_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
