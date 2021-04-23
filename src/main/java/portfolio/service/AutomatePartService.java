package portfolio.service;


import portfolio.component.CalculateProfitComponent;
import portfolio.component.TaxComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutomatePartService {

    private TaxComponent taxComponent;
    private CalculateProfitComponent CPComponent;

    @Autowired
    public void setTaxComponent(TaxComponent taxComponent) {this.taxComponent = taxComponent;}

    @Autowired
    public void setCPComponent(CalculateProfitComponent CPComponent) { this.CPComponent = CPComponent;}





}