package portfolio.model;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Bond")
public class Bond {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uid;

    @Column(name = "cost")
    private double cost;

    @Column(name = "payment")
    private double payment;

    @Column(name = "delayBeforePayment")
    private int delayBeforePayment;

    @Column(name = "risk")
    private int risk;

    @Column(name = "name")
    private String name;

    @Column(name = "conjuctureID")
    private UUID conjunctureID;

    public Bond(double cost, double payment, int delayBeforePayment, int risk, String name, UUID conjunctureID) {
        this.cost = cost;
        this.payment = payment;
        this.delayBeforePayment = delayBeforePayment;
        this.risk = risk;
        this.name = name;
        this.conjunctureID = conjunctureID;
    }

    public Bond() {

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public int getDelayBeforePayment() {
        return delayBeforePayment;
    }

    public void setDelayBeforePayment(int delayBeforePayment) {
        this.delayBeforePayment = delayBeforePayment;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getConjunctureID() {
        return conjunctureID;
    }

    public void setConjunctureID(UUID conjunctureID) {
        this.conjunctureID = conjunctureID;
    }

    @Override
    public String toString() {
        return "Bond{" +
                "uid=" + uid +
                ", cost=" + cost +
                ", payment=" + payment +
                ", delayBeforePayment=" + delayBeforePayment +
                ", risk=" + risk +
                ", name='" + name + '\'' +
                ", conjunctureID=" + conjunctureID +
                '}';
    }
}
