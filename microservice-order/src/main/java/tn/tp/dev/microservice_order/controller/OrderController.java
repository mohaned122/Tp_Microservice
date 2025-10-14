package tn.tp.dev.microservice_order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import tn.tp.dev.microservice_order.Entity.Client.Client;
import tn.tp.dev.microservice_order.Entity.Order;
import tn.tp.dev.microservice_order.Repository.OrderRepo;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepo orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/AllOrder")
    public List<Order> getAllOrders() {
        return (List<Order>) orderRepository.findAll();
    }


    @GetMapping("/with-customer/{id}")
    public Map<String, Object> getOrderWithCustomer(@PathVariable Integer id) {
        Order order = orderRepository.findById(id).orElseThrow();
        Client customer = restTemplate.getForObject(
                "http://localhost:8080/client/" + order.getClient(),Client.class );
        return Map.of("order", order, "customer", customer);
    }
}