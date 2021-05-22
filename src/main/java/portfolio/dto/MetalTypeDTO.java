package portfolio.dto;

import portfolio.model.MetalType;

import java.util.UUID;

public class MetalTypeDTO {

    private String type;

    public MetalTypeDTO(String type) {
        this.type = type;
    }

    public MetalTypeDTO(MetalType metalType) {
        this.type = metalType.getType();
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MetalTypeDTO{" +
                "type='" + type + '\'' +
                '}';
    }
}
