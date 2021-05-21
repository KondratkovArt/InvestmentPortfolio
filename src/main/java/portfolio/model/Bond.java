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
    private Double cost;

    @Column(name = "payment")
    private Double payment;

    @Column(name = "delayBeforePayment")
    private Integer delayBeforePayment;

    @Column(name = "risk")
    private Integer risk;

    @Column(name = "name")
    private String name;

    @Column(name = "conjuctureID")
    private Integer conjunctureID;

    public Bond(Double cost, Double payment, Integer delayBeforePayment, Integer risk, String name, Integer conjunctureID) {
        this.cost = cost;
        this.payment = payment;
        this.delayBeforePayment = delayBeforePayment;
        this.risk = risk;
        this.name = name;
        this.conjunctureID = conjunctureID;
    }

    public Bond() {

    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Integer getDelayBeforePayment() {
        return delayBeforePayment;
    }

    public void setDelayBeforePayment(Integer delayBeforePayment) {
        this.delayBeforePayment = delayBeforePayment;
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getConjunctureID() {
        return conjunctureID;
    }

    public void setConjunctureID(Integer conjunctureID) {
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
