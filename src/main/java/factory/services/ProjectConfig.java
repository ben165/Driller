package factory.services;

import factory.driller.TunnelDrillingMachine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public TunnelDrillingMachine tunnelDrillingMachine() {
        return new TunnelDrillingMachine();
    }
}
