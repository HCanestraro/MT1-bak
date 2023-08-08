package com.mindhub.homebanking;

import com.mindhub.homebanking.Models.Client;
import com.mindhub.homebanking.Repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(HomebankingApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository){
		return (args -> {
			Client client1 = new Client();
			client1.setFirstName("Javier");
			client1.setLastName("Miller");
			client1.setEmail("miller@mail.com");

			clientRepository.save(client1);


		});
	}

}