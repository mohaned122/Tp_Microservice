package tn.tp.dev.microservice_customer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.tp.dev.microservice_customer.Entity.Client;

@Repository
public interface ClientRepo extends CrudRepository<Client,Integer> {
}
