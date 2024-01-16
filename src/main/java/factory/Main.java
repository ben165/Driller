package factory;

import factory.services.ServiceName;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.command.annotation.Command;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
@Command(command = "cmd")
public class Main {
    private final MultiService multiService;

    @Command(command = "debug")
    public void run() {
        //log.info("executing factory with enum \"A_SERVICE\"");
        //log.info(multiService.getByEnum(ServiceName.A_SERVICE));
        //log.info("executing factory with enum \"B_SERVICE\"");
        //log.info(multiService.getByEnum(ServiceName.B_SERVICE));
    }

    @Command(command = "start")
    public String start() {
        //return multiService.getByEnum(ServiceName.valueOfIndex(i));
        return multiService.getByEnum(ServiceName.valueOfIndex(1));
        //return multiService.getByEnum(ServiceName.A_SERVICE);
    }

    @Command(command = "stop")
    public String stop() {
        //return multiService.getByEnum(ServiceName.B_SERVICE);
        return multiService.getByEnum(ServiceName.valueOfIndex(2));
        //return specific(i);
    }

    @Command(command = "left")
    public String left() {
        return multiService.getByEnum(ServiceName.valueOfIndex(3));
    }

    @Command(command = "right")
    public String right() {
        return multiService.getByEnum(ServiceName.valueOfIndex(4));
    }
}
