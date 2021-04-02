package di2.model;

import di2.model.Investment;
import di2.model.MetalType;

import java.util.UUID;

public class PreciousMetal implements Investment {

    private UUID uid = UUID.randomUUID();
    private MetalType type;
    private double cost;
    private int risk;

    public PreciousMetal(MetalType type, double cost, int risk) {
        this.type = type;
        this.cost = cost;
        this.risk = risk;
    }

    @Override
    public String getInfo() {
        return "\nMetalType: " + type + "\ncost: " + cost +
                "\nrisk: " + risk;
    }

    public MetalType getType() {
        return type;
    }

    public void setType(MetalType type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getRisk() {
        return risk;
    }


    @Override
    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }
}
