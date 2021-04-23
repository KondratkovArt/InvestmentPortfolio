package portfolio;

import portfolio.component.DumbComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import portfolio.service.*;
import portfolio.config.*;

@Configuration
@ComponentScan(basePackageClasses = {DumbService.class,
        ApplicationConfig.class,
        DumbComponent.class})

public class SampleApplication {
    public static void main(String[] args) {
        
    }

}
