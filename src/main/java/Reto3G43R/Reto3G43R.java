package Reto3G43R;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"Reto3G43R.Modelo"} )
@SpringBootApplication
public class Reto3G43R {

	public static void main(String[] args) {
		SpringApplication.run(Reto3G43R.class, args);
	}

}
