package portfolio.model;


import javax.persistence.*;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stock_id;

    @Column(name = "name")
    private String name;

    @Column(name = "profitability")
    private Double profitability;

    @Column(name = "price")
    private Double price;

    @Column(name = "risk")
    private Integer risk;

    @ManyToOne
    @JoinColumn(name = "conjuncture_id")
    private Conjuncture conjuncture;

    public Stock(String name, Double profitability, Double price, Integer risk, Conjuncture conjuncture) {
        this.name = name;
        this.profitability = profitability;
        this.price = price;
        this.risk = risk;
        this.conjuncture = conjuncture;
    }

    public Stock(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getProfitability() {
        return profitability;
    }

    public void setProfitability(Double profitability) {
        this.profitability = profitability;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    public Conjuncture getConjuncture() {
        return conjuncture;
    }

    public void setConjuncture(Conjuncture conjuncture) {
        this.conjuncture = conjuncture;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stock_id=" + stock_id +
                ", name='" + name + '\'' +
                ", profitability=" + profitability +
                ", price=" + price +
                ", risk=" + risk +
                ", conjuncture=" + conjuncture +
                '}';
    }
}
