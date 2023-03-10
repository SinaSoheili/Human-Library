package net.sinasoheili.humanlibrary.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "net.sinasoheili.humanlibrary")
public class HumanLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanLibraryApplication.class, args);
	}

}
