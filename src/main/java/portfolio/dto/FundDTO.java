package portfolio.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FundDTO {

    private UUID uid;
    private double capital;
    private double profit;

    private List<BondsDTO>  bonds;
    private List<DepositDTO> depositDTOS;
    private List<PreciousMetalDTO> metals;
    private List<StockDTO> stockDTOS;


    public FundDTO(UUID uid, double capital) {
        this.uid = uid;
        this.capital = capital;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public List<BondsDTO> getBonds() {
        return bonds;
    }

    public void setBonds(List<BondsDTO> bonds) {
        this.bonds = bonds;
    }

    public List<DepositDTO> getDeposits() {
        return depositDTOS;
    }

    public void setDeposits(List<DepositDTO> depositDTOS) {
        this.depositDTOS = depositDTOS;
    }

    public List<PreciousMetalDTO> getMetals() {
        return metals;
    }

    public void setMetals(List<PreciousMetalDTO> metals) {
        this.metals = metals;
    }

    public List<StockDTO> getStocks() {
        return stockDTOS;
    }

    public void setStocks(List<StockDTO> stockDTOS) {
        this.stockDTOS = stockDTOS;
    }
}
