package io.suresh.UserMoviesRatingServicedescovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UserMoviesRatingServiceDescoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMoviesRatingServiceDescoveryApplication.class, args);
	}

}
