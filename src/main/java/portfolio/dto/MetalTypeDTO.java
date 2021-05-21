package portfolio.dto;

import java.util.UUID;

public enum MetalTypeDTO {
    ;

    private String type;

    MetalTypeDTO(String type) {
        this.type = type;
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
