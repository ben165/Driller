package factory.services;

import factory.driller.TunnelDrillingMachine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service(ServiceName.serviceDName)
public class ServiceRightDrilling implements IService {



    public String getInfoAboutService() {
        return ServiceName.D_SERVICE.serviceName;
    }

    @Override
    public void operate() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var t = context.getBean("machine1", TunnelDrillingMachine.class);

        t.getDrillingHead().rotateRight();
    }
}
