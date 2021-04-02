package di2.model;

import java.util.UUID;

public class Deposit implements Investment {

    private UUID uid = UUID.randomUUID();
    private String name;
    private int minimalPeriod;
    private double interestRate;
    private int risk;

    public Deposit(String name, int minimalPeriod, double interestRate, int risk) {
        this.name = name;
        this.minimalPeriod = minimalPeriod;
        this.interestRate = interestRate;
        this.risk = risk;
    }

    @Override
    public String getInfo() {
        return "\nminimalPeriod: " + minimalPeriod + "\ninterestRate: " + interestRate +
                "\nrisk: " + risk;
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

    public double getRisk() {
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

    @Override
    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }
}
