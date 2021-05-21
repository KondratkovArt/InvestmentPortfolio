package portfolio.dto;

import java.util.UUID;

public class PreciousMetalDTO {

    private UUID uid;
    private MetalTypeDTO type;
    private double cost;
    private int risk;

    public PreciousMetalDTO(UUID uid, MetalTypeDTO type, double cost, int risk) {
        this.uid = uid;
        this.type = type;
        this.cost = cost;
        this.risk = risk;
    }

    public String getInfo() {
        return "\nMetalType: " + type + "\ncost: " + cost +
                "\nrisk: " + risk;
    }

    public MetalTypeDTO getType() {
        return type;
    }

    public void setType(MetalTypeDTO type) {
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
