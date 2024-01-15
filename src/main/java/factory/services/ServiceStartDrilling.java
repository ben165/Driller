package factory.services;

import org.springframework.stereotype.Service;

@Service(ServiceName.serviceAName)
public class ServiceStartDrilling implements IService {
    public String getInfoAboutService() {
        return ServiceName.A_SERVICE.serviceName;
    }
}
