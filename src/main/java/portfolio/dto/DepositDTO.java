package portfolio.dto;

import java.util.UUID;

public class DepositDTO {

    private String name;
    private Integer minimalPeriod;
    private Double interestRate;
    private Integer risk;

    public DepositDTO(String name, Integer minimalPeriod, Double interestRate, Integer risk) {
        this.name = name;
        this.minimalPeriod = minimalPeriod;
        this.interestRate = interestRate;
        this.risk = risk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinimalPeriod() {
        return minimalPeriod;
    }

    public void setMinimalPeriod(Integer minimalPeriod) {
        this.minimalPeriod = minimalPeriod;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    @Override
    public String toString() {
        return "DepositDTO{" +
                "name='" + name + '\'' +
                ", minimalPeriod=" + minimalPeriod +
                ", interestRate=" + interestRate +
                ", risk=" + risk +
                '}';
    }
}
