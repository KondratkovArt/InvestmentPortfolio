package di2.component;


import di2.model.Investment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CalculateProfitComponent {


    public double calculateProfit(List<Investment> investments) {

        double profit = 0;

        for (Investment inv: investments) {
            // calc profit
        }



        return profit;
    }
}
