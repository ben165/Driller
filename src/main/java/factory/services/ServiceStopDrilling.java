package factory.services;

import factory.driller.TunnelDrillingMachine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service(ServiceName.serviceBName)
public class ServiceStopDrilling implements IService {
    public String getInfoAboutService() {
        return ServiceName.B_SERVICE.serviceName;
    }

    public void operate() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var t = context.getBean("machine1", TunnelDrillingMachine.class);

        t.getDrillingHead().stop();
    }
}
