package portfolio.dto;

import java.util.Objects;
import java.util.UUID;

public class BondsDTO{

    private UUID uid;

    private String name;
    private double cost;
    private double payment;
    private int delayBeforePayment;
    private int risk;


    public BondsDTO(UUID uid, String name, double cost, int delayBeforePayment, int risk, double payment) {
        this.uid = uid;
        this.name = name;
        this.cost = cost;
        this.delayBeforePayment = delayBeforePayment;
        this.risk = risk;
        this.payment = payment;
    }


    @Override
    public String toString() {
        return "Bonds{" +
                "cost=" + cost +
                ", payment=" + payment +
                ", delayBeforePayment=" + delayBeforePayment +
                ", risk=" + risk +
                '}';
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
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

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "\ncost: " + cost + "\npayment: " + payment +
                "\ndelay before payment: " + delayBeforePayment + "\nrisk: " + risk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BondsDTO bondsDTO = (BondsDTO) o;
        return uid.equals(bondsDTO.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }
}
