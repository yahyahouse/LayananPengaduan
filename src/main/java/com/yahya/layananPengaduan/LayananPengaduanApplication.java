package com.yahya.layananPengaduan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
public class LayananPengaduanApplication {

	public static void main(String[] args) {
		SpringApplication.run(LayananPengaduanApplication.class, args);
	}

}
