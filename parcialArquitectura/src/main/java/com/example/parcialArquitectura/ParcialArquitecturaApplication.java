package com.example.parcialArquitectura;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParcialArquitecturaApplication {

	public static void main(String[] args) {
		loadEnv();
		SpringApplication.run(ParcialArquitecturaApplication.class, args);
	}
	private static void loadEnv(){

		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL",dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));


		System.out.println("DB_URL: " + dotenv.get("DB_URL"));
		System.out.println("DB_USERNAME: " + dotenv.get("DB_USERNAME"));
		System.out.println("DB_PASSWORD: " + dotenv.get("DB_PASSWORD"));
	}

}
