package portfolio.model;

import javax.persistence.*;

@Entity
@Table(name = "MetalType")
public class MetalType {

    @Id
    @GeneratedValue ()


    @Column(name = "type")
    private String type;
}
