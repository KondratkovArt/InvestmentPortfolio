package portfolio.model;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Deposit")
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    @Column(name = "name")
    private String name;

    @Column(name = "minimalPeriod")
    private Integer minimalPeriod;

    @Column(name = "interestRate")
    private Double interestRate;

    @Column(name = "risk")
    private Integer risk;

    @Column(name = "conjunctureID")
    private Integer conjunctureID;

    public Deposit() {

    }

    public Deposit(String name, Integer minimalPeriod, Double interestRate, Integer risk, Integer conjunctureID) {
        this.name = name;
        this.minimalPeriod = minimalPeriod;
        this.interestRate = interestRate;
        this.risk = risk;
        this.conjunctureID = conjunctureID;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public Integer getConjunctureID() {
        return conjunctureID;
    }

    public void setConjunctureID(Integer conjunctureID) {
        this.conjunctureID = conjunctureID;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", minimalPeriod=" + minimalPeriod +
                ", interestRate=" + interestRate +
                ", risk=" + risk +
                ", conjunctureID=" + conjunctureID +
                '}';
    }
}
