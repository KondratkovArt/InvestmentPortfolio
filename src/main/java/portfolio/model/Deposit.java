package portfolio.model;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Deposit")
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deposit_id;

    @Column(name = "name")
    private String name;

    @Column(name = "minimalPeriod")
    private Integer minimalPeriod;

    @Column(name = "interestRate")
    private Double interestRate;

    @Column(name = "risk")
    private Integer risk;

    @ManyToOne
    @JoinColumn(name = "conjuncture_id")
    private Conjuncture conjuncture;

    public Deposit() {

    }

    public Deposit(String name, Integer minimalPeriod, Double interestRate, Integer risk, Conjuncture conjuncture) {
        this.name = name;
        this.minimalPeriod = minimalPeriod;
        this.interestRate = interestRate;
        this.risk = risk;
        this.conjuncture = conjuncture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinimalPeriod() {
        return minimalPeriod;
    }

    public void setMinimalPeriod(Integer minimalPeriod) {
        this.minimalPeriod = minimalPeriod;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
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
        return "Deposit{" +
                "deposit_id=" + deposit_id +
                ", name='" + name + '\'' +
                ", minimalPeriod=" + minimalPeriod +
                ", interestRate=" + interestRate +
                ", risk=" + risk +
                ", conjuncture=" + conjuncture +
                '}';
    }
}
