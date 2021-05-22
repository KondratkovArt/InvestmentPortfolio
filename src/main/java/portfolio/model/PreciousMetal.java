package portfolio.model;

import javax.persistence.*;

@Entity
@Table(name = "precious_metal")
public class PreciousMetal {

    @Id
    @GeneratedValue
    private Integer precious_metal_id;

    @ManyToOne
    @JoinColumn(name = "metal_type")
    private MetalType metal_type;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "risk")
    private Integer risk;

    @ManyToOne
    @JoinColumn(name = "conjuncture_id")
    private Conjuncture conjuncture;


    public PreciousMetal(MetalType metal_type, Double cost, Integer risk, Conjuncture conjuncture) {
        this.metal_type = metal_type;
        this.cost = cost;
        this.risk = risk;
        this.conjuncture = conjuncture;
    }

    public PreciousMetal() {

    }

    public MetalType getMetal_type() {
        return metal_type;
    }

    public void setMetal_type(MetalType metal_type) {
        this.metal_type = metal_type;
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

    public Conjuncture getConjuncture() {
        return conjuncture;
    }

    public void setConjuncture(Conjuncture conjuncture) {
        this.conjuncture = conjuncture;
    }

    @Override
    public String toString() {
        return "PreciousMetal{" +
                "precious_metal_id=" + precious_metal_id +
                ", metal_type=" + metal_type +
                ", cost=" + cost +
                ", risk=" + risk +
                ", conjuncture=" + conjuncture +
                '}';
    }
}
