package portfolio.dto;

import java.util.Objects;
import java.util.UUID;

public class BondDTO {

    private String name;
    private Double cost;
    private Double payment;
    private Integer delayBeforePayment;
    private Integer risk;


    public BondDTO(String name, Double cost, Integer delayBeforePayment, Integer risk, Double payment) {
        this.name = name;
        this.cost = cost;
        this.delayBeforePayment = delayBeforePayment;
        this.risk = risk;
        this.payment = payment;
    }


    @Override
    public String toString() {
        return "Bonds{" +
                "cost=" + cost +
                ", payment=" + payment +
                ", delayBeforePayment=" + delayBeforePayment +
                ", risk=" + risk +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Integer getDelayBeforePayment() {
        return delayBeforePayment;
    }

    public void setDelayBeforePayment(Integer delayBeforePayment) {
        this.delayBeforePayment = delayBeforePayment;
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

}
