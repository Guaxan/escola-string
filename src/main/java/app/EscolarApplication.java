package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "app.entity")
@SpringBootApplication
public class EscolarApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolarApplication.class, args);
	}

}
