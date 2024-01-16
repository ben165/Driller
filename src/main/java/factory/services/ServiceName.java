package factory.services;

import java.util.HashMap;
import java.util.Map;

public enum ServiceName {
    A_SERVICE(ServiceName.serviceAName, 1),
    B_SERVICE(ServiceName.serviceBName, 2),
    C_SERVICE(ServiceName.serviceCName, 3),
    D_SERVICE(ServiceName.serviceDName, 4);

    public static final String serviceAName = "Service Start";
    public static final String serviceBName = "Service Stop";
    public static final String serviceCName = "Service Left Drilling";
    public static final String serviceDName = "Service Right Drilling";
    private static final Map<Integer, ServiceName> BY_INDEX = new HashMap<>();

    static {
        for (ServiceName e : values()) {
            BY_INDEX.put(e.index, e);
        }
    }

    public final String serviceName;
    public final int index;

    ServiceName(String serviceName, int index) {
        this.serviceName = serviceName;
        this.index = index;
    }

    public static ServiceName valueOfIndex(int index) {
        return BY_INDEX.get(index);
    }
}
