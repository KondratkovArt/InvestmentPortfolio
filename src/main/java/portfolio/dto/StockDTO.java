package portfolio.dto;

import portfolio.model.Stock;

import java.util.UUID;

public class StockDTO {

    private String name;
    private Double price;
    private Integer risk;
    private Double profitability;
    private ConjunctureDTO conjunctureDTO;


    public StockDTO(String name, Double price, Integer risk, Double profitability, ConjunctureDTO conjunctureDTO) {
        this.name = name;
        this.price = price;
        this.risk = risk;
        this.profitability = profitability;
        this.conjunctureDTO = conjunctureDTO;
    }

    public StockDTO(Stock stock) {
        this.name = stock.getName();
        this.price = stock.getPrice();
        this.risk = stock.getRisk();
        this.profitability = stock.getProfitability();
        this.conjunctureDTO = new ConjunctureDTO(stock.getConjuncture());
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

    public ConjunctureDTO getConjunctureDTO() {
        return conjunctureDTO;
    }

    public void setConjunctureDTO(ConjunctureDTO conjunctureDTO) {
        this.conjunctureDTO = conjunctureDTO;
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
