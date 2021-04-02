package di2.model;

import di2.model.Investment;

import java.util.Objects;
import java.util.UUID;

public class Bonds implements Investment {

    private UUID uid = UUID.randomUUID();

    private String name;
    private double cost;
    private double payment;
    private int delayBeforePayment;
    private int risk;


    public Bonds(String name, double cost, int delayBeforePayment, int risk, double payment) {
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

    @Override
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

    @Override
    public String getInfo() {
        return "\ncost: " + cost + "\npayment: " + payment +
                "\ndelay before payment: " + delayBeforePayment + "\nrisk: " + risk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bonds bonds = (Bonds) o;
        return uid.equals(bonds.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }
}
