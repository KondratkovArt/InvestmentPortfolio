package portfolio.model;

import javax.persistence.*;

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
