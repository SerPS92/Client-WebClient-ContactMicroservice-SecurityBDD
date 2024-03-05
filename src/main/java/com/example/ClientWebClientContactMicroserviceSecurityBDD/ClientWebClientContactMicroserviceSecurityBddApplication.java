package com.example.ClientWebClientContactMicroserviceSecurityBDD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ClientWebClientContactMicroserviceSecurityBddApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientWebClientContactMicroserviceSecurityBddApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

	@Bean
	public WebClient getClient(){
		return WebClient.create();
	}

}
