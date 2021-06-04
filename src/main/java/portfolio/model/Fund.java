package portfolio.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "fund")
public class Fund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fund_id;

    @Column(name = "capital")
    private Double capital;

    @Column(name = "profit")
    private Double profit;

    @ManyToOne
    @JoinColumn(name = "conjuncture_id")
    private Conjuncture conjuncture;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fund")
    private List<Bond> bonds;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fund")
    private List<Deposit> deposits;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fund")
    private List<PreciousMetal> preciousMetals;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fund")
    private List<Stock> stocks;

    public Fund(Double capital, Double profit, Conjuncture conjuncture) {
        this.capital = capital;
        this.profit = profit;
        this.conjuncture = conjuncture;
    }

    public Fund(){

    }

    public Integer getFund_id() {
        return fund_id;
    }

    public void setFund_id(Integer fund_id) {
        this.fund_id = fund_id;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Conjuncture getConjuncture() {
        return conjuncture;
    }

    public void setConjuncture(Conjuncture conjuncture) {
        this.conjuncture = conjuncture;
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

    @Override
    public String toString() {
        return "Fund{" +
                "fund_id=" + fund_id +
                ", capital=" + capital +
                ", profit=" + profit +
                ", conjuncture=" + conjuncture +
                '}';
    }
}
