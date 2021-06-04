package portfolio;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import portfolio.repository.BondRepository;
import portfolio.service.*;
import portfolio.config.*;

@Configuration
@ComponentScan(basePackageClasses = {DumbService.class,
        ApplicationConfig.class,
        BondRepository.class})

public class SampleApplication {
    public static void main(String[] args) {
        
    }

}
