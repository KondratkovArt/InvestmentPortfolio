package portfolio.dto;

import java.util.UUID;

public class PreciousMetalDTO {

    private MetalTypeDTO type;
    private Double cost;
    private Integer risk;

    public PreciousMetalDTO(MetalTypeDTO type, Double cost, Integer risk) {
        this.type = type;
        this.cost = cost;
        this.risk = risk;
    }

    public MetalTypeDTO getType() {
        return type;
    }

    public void setType(MetalTypeDTO type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    @Override
    public String toString() {
        return "PreciousMetalDTO{" +
                "type=" + type +
                ", cost=" + cost +
                ", risk=" + risk +
                '}';
    }
}
