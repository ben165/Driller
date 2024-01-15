package factory;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.EnableCommand;

@SpringBootApplication
@AllArgsConstructor
@EnableCommand(Main.class)
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
