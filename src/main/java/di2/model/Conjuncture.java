package di2.model;

import di2.model.Investment;

import java.util.ArrayList;
import java.util.List;

public class Conjuncture {

    private ArrayList<Investment> availableInvestments;

    public Conjuncture(){}

    public Conjuncture(ArrayList<Investment> availableInvestments) {
        this.availableInvestments = availableInvestments;
    }


    public ArrayList<Investment> getAvailableInvestments() {
        return availableInvestments;
    }

    public void setNewInvestment(Investment investment) {
        this.availableInvestments.add(investment);
    }

    public void setNewInvestments(List<Investment> investments){
        availableInvestments.addAll(investments);
    }
}
