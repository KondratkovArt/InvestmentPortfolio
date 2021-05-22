package portfolio.dto;

import portfolio.model.Bond;

import java.util.Objects;
import java.util.UUID;

public class BondDTO {

    private String name;
    private Double cost;
    private Double payment;
    private Integer delayBeforePayment;
    private Integer risk;
    private ConjunctureDTO conjunctureDTO;


    public BondDTO(String name, Double cost, Integer delayBeforePayment, Integer risk,
                   Double payment, ConjunctureDTO conjunctureDTO) {
        this.name = name;
        this.cost = cost;
        this.delayBeforePayment = delayBeforePayment;
        this.risk = risk;
        this.payment = payment;
        this.conjunctureDTO = conjunctureDTO;
    }

    public BondDTO(Bond bond) {
        this.name = bond.getName();
        this.cost = bond.getCost();
        this.delayBeforePayment = bond.getDelayBeforePayment();
        this.risk = bond.getRisk();
        this.payment = bond.getPayment();
        this.conjunctureDTO = new ConjunctureDTO(bond.getConjuncture());
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

    public ConjunctureDTO getConjunctureDTO() {
        return conjunctureDTO;
    }

    public void setConjunctureDTO(ConjunctureDTO conjunctureDTO) {
        this.conjunctureDTO = conjunctureDTO;
    }
}
