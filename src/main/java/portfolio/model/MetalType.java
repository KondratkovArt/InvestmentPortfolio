package portfolio.model;

import javax.persistence.*;

@Entity
@Table(name = "MetalType")
public class MetalType {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type")
    private String type;
}
