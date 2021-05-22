package portfolio.dto;

import java.util.List;
import java.util.UUID;

public class FundDTO {

    private Double capital;
    private Double profit;

    private List<BondDTO> bonds;
    private List<DepositDTO> depositDTOS;
    private List<PreciousMetalDTO> metals;
    private List<StockDTO> stockDTOS;
    private ConjunctureDTO conjunctureDTO;


    public FundDTO(Double capital, Double profit, List<BondDTO> bonds,
                   List<DepositDTO> depositDTOS, List<PreciousMetalDTO> metals,
                   List<StockDTO> stockDTOS, ConjunctureDTO conjunctureDTO) {
        this.capital = capital;
        this.profit = profit;
        this.bonds = bonds;
        this.depositDTOS = depositDTOS;
        this.metals = metals;
        this.stockDTOS = stockDTOS;
        this.conjunctureDTO = conjunctureDTO;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public List<BondDTO> getBonds() {
        return bonds;
    }

    public void setBonds(List<BondDTO> bonds) {
        this.bonds = bonds;
    }

    public List<DepositDTO> getDepositDTOS() {
        return depositDTOS;
    }

    public void setDepositDTOS(List<DepositDTO> depositDTOS) {
        this.depositDTOS = depositDTOS;
    }

    public List<PreciousMetalDTO> getMetals() {
        return metals;
    }

    public void setMetals(List<PreciousMetalDTO> metals) {
        this.metals = metals;
    }

    public List<StockDTO> getStockDTOS() {
        return stockDTOS;
    }

    public void setStockDTOS(List<StockDTO> stockDTOS) {
        this.stockDTOS = stockDTOS;
    }

    public ConjunctureDTO getConjunctureDTO() {
        return conjunctureDTO;
    }

    public void setConjunctureDTO(ConjunctureDTO conjunctureDTO) {
        this.conjunctureDTO = conjunctureDTO;
    }

    @Override
    public String toString() {
        return "FundDTO{" +
                "capital=" + capital +
                ", profit=" + profit +
                ", bonds=" + bonds +
                ", depositDTOS=" + depositDTOS +
                ", metals=" + metals +
                ", stockDTOS=" + stockDTOS +
                ", conjunctureDTO=" + conjunctureDTO +
                '}';
    }
}
