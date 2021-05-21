package portfolio.model;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Deposit")
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uid;

    @Column(name = "name")
    private String name;

    @Column(name = "minimalPeriod")
    private int minimalPeriod;

    @Column(name = "interestRate")
    private double interestRate;

    @Column(name = "risk")
    private int risk;

    @Column(name = "conjunctureID")
    private UUID conjunctureID;

    public Deposit() {

    }

    public Deposit(String name, int minimalPeriod, double interestRate, int risk, UUID conjunctureID) {
        this.name = name;
        this.minimalPeriod = minimalPeriod;
        this.interestRate = interestRate;
        this.risk = risk;
        this.conjunctureID = conjunctureID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinimalPeriod() {
        return minimalPeriod;
    }

    public void setMinimalPeriod(int minimalPeriod) {
        this.minimalPeriod = minimalPeriod;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public UUID getConjunctureID() {
        return conjunctureID;
    }

    public void setConjunctureID(UUID conjunctureID) {
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
