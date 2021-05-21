package portfolio.dto;

import java.util.UUID;

public class StockDTO {

    private String name;
    private Double price;
    private Integer risk;
    private Double profitability;


    public StockDTO(String name, Double price, Integer risk, Double profitability) {
        this.name = name;
        this.price = price;
        this.risk = risk;
        this.profitability = profitability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    public Double getProfitability() {
        return profitability;
    }

    public void setProfitability(Double profitability) {
        this.profitability = profitability;
    }

    @Override
    public String toString() {
        return "StockDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", risk=" + risk +
                ", profitability=" + profitability +
                '}';
    }
}
