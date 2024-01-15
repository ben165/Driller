package factory.services;

import org.springframework.stereotype.Service;

@Service(ServiceName.serviceDName)
public class ServiceRightDrilling implements IService {
    public String getInfoAboutService() {
        return ServiceName.D_SERVICE.serviceName;
    }
}
