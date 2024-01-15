package factory;

import lombok.AllArgsConstructor;
import factory.services.IService;
import factory.services.ServiceName;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class MultiService {
    private final Map<String, IService> serviceInterfaceMap;

    public String getByEnum(ServiceName serviceName) {
        return serviceInterfaceMap.get(serviceName.serviceName).getInfoAboutService();
    }
}
