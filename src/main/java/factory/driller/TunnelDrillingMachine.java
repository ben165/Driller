package factory.driller;

import org.springframework.stereotype.Component;

public class TunnelDrillingMachine {
    final private String name;
    final private String type;

    final private DrillingHead drillingHead;

    public TunnelDrillingMachine() {
        this.name = "Machine 1";
        this.type = "Type 123";
        this.drillingHead = new DrillingHead("Siemens", "R12", "T123");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public DrillingHead getDrillingHead() {
        return drillingHead;
    }
}
