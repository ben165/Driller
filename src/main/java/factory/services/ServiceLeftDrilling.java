package factory.services;

import factory.driller.TunnelDrillingMachine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service(ServiceName.serviceCName)
public class ServiceLeftDrilling implements IService {
    public String getInfoAboutService() {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        TunnelDrillingMachine t = context.getBean(TunnelDrillingMachine.class);


        t.getDrillingHead().rotateLeft();
        return ServiceName.C_SERVICE.serviceName;

    }
}
