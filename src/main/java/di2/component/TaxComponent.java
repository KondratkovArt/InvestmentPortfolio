package di2.component;


import org.springframework.stereotype.Component;

@Component
public class TaxComponent {

    public double payTaxes(double monthlyIncome) {
        return monthlyIncome * 0.87;
    }

}
