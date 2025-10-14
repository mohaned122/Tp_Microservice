package tn.tp.dev.microservice_order.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.tp.dev.microservice_order.Entity.Order;

import java.util.List;

@Repository
public interface OrderRepo extends CrudRepository<Order, Integer> {
    List<Order> findByClient(Integer customerId);
}
