package com.vscube.games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.vscube.games.db.repo")
public class GamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamesApplication.class, args);
	}

	//TODO


}
