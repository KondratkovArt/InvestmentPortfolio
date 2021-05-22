package portfolio.model;

import javax.persistence.*;

@Entity
@Table(name = "MetalType")
public class MetalType {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer metal_type_id;

    @Column(name = "type")
    private String type;

    public MetalType(String type) {
        this.type = type;
    }

    public MetalType() {

    }

    public Integer getMetal_type_id() {
        return metal_type_id;
    }

    public void setMetal_type_id(Integer metal_type_id) {
        this.metal_type_id = metal_type_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
