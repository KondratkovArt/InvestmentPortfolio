package portfolio.model;

import java.util.ArrayList;
import java.util.List;

public class Fund {

    private double capital;
    private double profit;

    /* private HashMap<> мапа с профитом по каждому типу вложений
     * ключ - класс, значение - профит по всем экземплярам класса?
     */

    private List<Investment> investmentList = new ArrayList<>();
    private List<Bonds>  bonds;
    private List<Deposit> deposits;
    private List<PreciousMetal> metals;
    private List<Stock> stocks;


    public Fund(double capital) {
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

    public List<Investment> getInvestmentList() {
        return investmentList;
    }

    public void setInvestmentList(List<Investment> investmentList) {
        this.investmentList = investmentList;
    }

    public List<Bonds> getBonds() {
        return bonds;
    }

    public void setBonds(List<Bonds> bonds) {
        this.bonds = bonds;
    }

    public List<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<Deposit> deposits) {
        this.deposits = deposits;
    }

    public List<PreciousMetal> getMetals() {
        return metals;
    }

    public void setMetals(List<PreciousMetal> metals) {
        this.metals = metals;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
