package portfolio.dto;

import java.util.List;
import java.util.UUID;

public class FundDTO {

    private Double capital;
    private Double profit;

    private List<BondDTO>  bonds;
    private List<DepositDTO> depositDTOS;
    private List<PreciousMetalDTO> metals;
    private List<StockDTO> stockDTOS;


    public FundDTO(Double capital, Double profit, List<BondDTO> bonds,
                   List<DepositDTO> depositDTOS, List<PreciousMetalDTO> metals,
                   List<StockDTO> stockDTOS) {
        this.capital = capital;
        this.profit = profit;
        this.bonds = bonds;
        this.depositDTOS = depositDTOS;
        this.metals = metals;
        this.stockDTOS = stockDTOS;
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
}
