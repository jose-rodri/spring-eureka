package jose.rodriguez.everis.peru.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SpringBootProyectoEverisEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProyectoEverisEurekaServerApplication.class, args);
	}

}
