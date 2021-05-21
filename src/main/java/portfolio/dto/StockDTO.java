package portfolio.dto;

import java.util.UUID;

public class StockDTO {


    private UUID uid;
    private String name;
    private double price;
    private int risk;
    private double profitability;


    public StockDTO(UUID uid, String name, double price, int risk, double profitability) {
        this.uid = uid;
        this.name = name;
        this.price = price;
        this.risk = risk;
        this.profitability = profitability;
    }

    public String getInfo() {
        return "\nprice: " + price + "\nprofitability: " + profitability +
                "\nrisk: " + risk;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public double getProfitability() {
        return profitability;
    }

    public void setProfitability(double profitability) {
        this.profitability = profitability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }
}