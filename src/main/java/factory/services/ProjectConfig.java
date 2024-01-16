package factory.services;

import factory.driller.TunnelDrillingMachine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    @Primary
    TunnelDrillingMachine machine1() {
        return new TunnelDrillingMachine();
    }
}
