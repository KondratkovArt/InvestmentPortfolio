package portfolio.dto;

import java.util.UUID;

public enum MetalTypeDTO {
    ;

    private UUID uid;
    private String type;

    MetalTypeDTO(UUID uid, String type) {
        this.uid = uid;
        this.type = type;
    }

    @Override
    public String toString() {
        return "MetalTypeDTO{" +
                "uid=" + uid +
                ", type='" + type + '\'' +
                '}';
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
