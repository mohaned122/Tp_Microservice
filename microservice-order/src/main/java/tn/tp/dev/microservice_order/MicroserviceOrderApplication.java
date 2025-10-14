package tn.tp.dev.microservice_order;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tn.tp.dev.microservice_order.Entity.Order;
import tn.tp.dev.microservice_order.Repository.OrderRepo;

import java.util.List;

@SpringBootApplication
public class MicroserviceOrderApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    @Bean
    CommandLineRunner initDatabase(OrderRepo repo) {

        return args -> {
            repo.saveAll(List.of(
                    new Order(null, "Laptop", 1, 1),
                    new Order(null, "Smartphone", 2, 2),
                    new Order(null, "Headphones", 1, 3)
            ));
        };
    }

    public static void main(String[] args) {
		SpringApplication.run(MicroserviceOrderApplication.class, args);
	}

}
