package portfolio.dto;

import portfolio.model.MetalType;
import portfolio.model.PreciousMetal;

import java.util.UUID;

public class PreciousMetalDTO {

    private MetalTypeDTO type;
    private Double cost;
    private Integer risk;
    private ConjunctureDTO conjunctureDTO;

    public PreciousMetalDTO(MetalTypeDTO type, Double cost, Integer risk, ConjunctureDTO conjunctureDTO) {
        this.type = type;
        this.cost = cost;
        this.risk = risk;
        this.conjunctureDTO = conjunctureDTO;
    }

    public PreciousMetalDTO(PreciousMetal pm) {
        this.type = new MetalTypeDTO(pm.getMetal_type());
        this.cost = pm.getCost();
        this.risk = pm.getRisk();
        this.conjunctureDTO = new ConjunctureDTO(pm.getConjuncture());
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

    public ConjunctureDTO getConjunctureDTO() {
        return conjunctureDTO;
    }

    public void setConjunctureDTO(ConjunctureDTO conjunctureDTO) {
        this.conjunctureDTO = conjunctureDTO;
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
