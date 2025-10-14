package tn.tp.dev.microservice_customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.tp.dev.microservice_customer.Entity.Client;
import tn.tp.dev.microservice_customer.Repository.ClientRepo;

import java.util.List;

@SpringBootApplication
public class MicroserviceCustomerApplication {

    @Bean
    CommandLineRunner initDatabase(ClientRepo repo) {
        return args -> {
            repo.saveAll(List.of(
                    new Client(null, "Alice","alice@mail.com"),
                    new Client(null, "Bob", "bob@mail.com")
            ));
        };
    }


    public static void main(String[] args) {
		SpringApplication.run(MicroserviceCustomerApplication.class, args);
	}

}
