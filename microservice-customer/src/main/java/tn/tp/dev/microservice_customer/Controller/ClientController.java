package tn.tp.dev.microservice_customer.Controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.tp.dev.microservice_customer.Entity.Client;
import tn.tp.dev.microservice_customer.Repository.ClientRepo;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/allClient")
    public List<Client> findAll(){
        return (List<Client>) clientRepo.findAll();
    }

    @GetMapping("/{id}")
    public Client findById(@PathVariable int id){
        return clientRepo.findById(id).orElse(null);
    }
}
