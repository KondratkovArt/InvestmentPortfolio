package portfolio.dto;

import portfolio.model.Deposit;

import java.util.UUID;

public class DepositDTO {

    private String name;
    private Integer minimalPeriod;
    private Double interestRate;
    private Integer risk;
    private ConjunctureDTO conjunctureDTO;

    public DepositDTO(String name, Integer minimalPeriod, Double interestRate,
                      Integer risk, ConjunctureDTO conjunctureDTO) {
        this.name = name;
        this.minimalPeriod = minimalPeriod;
        this.interestRate = interestRate;
        this.risk = risk;
        this.conjunctureDTO = conjunctureDTO;
    }

    public DepositDTO(Deposit deposit) {
        this.name = deposit.getName();
        this.minimalPeriod = deposit.getMinimalPeriod();
        this.interestRate = deposit.getInterestRate();
        this.risk = deposit.getRisk();
        this.conjunctureDTO = new ConjunctureDTO(deposit.getConjuncture());
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

    public ConjunctureDTO getConjunctureDTO() {
        return conjunctureDTO;
    }

    public void setConjunctureDTO(ConjunctureDTO conjunctureDTO) {
        this.conjunctureDTO = conjunctureDTO;
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
