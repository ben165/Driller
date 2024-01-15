package factory.services;

import org.springframework.stereotype.Service;

@Service(ServiceName.serviceBName)
public class ServiceStopDrilling implements IService {
    public String getInfoAboutService() {
        return ServiceName.B_SERVICE.serviceName;
    }
}
