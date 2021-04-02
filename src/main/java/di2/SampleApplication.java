package di2;

import di2.component.DumbComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import di2.service.*;
import di2.config.*;

@Configuration
@ComponentScan(basePackageClasses = {DumbService.class,
        ApplicationConfig.class,
        DumbComponent.class})

public class SampleApplication {
    public static void main(String[] args) {
        
    }

}
