package pe.alicorp.skn.services.exp.clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.com.alicorp.skynet.runner.StarterWebApplication;

@SpringBootApplication
public class ClientsApplication extends StarterWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientsApplication.class, args);
	}

}
