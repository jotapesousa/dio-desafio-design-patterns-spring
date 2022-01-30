package br.org.jprojects.desafiodesignpatternsspring.controllers;

import br.org.jprojects.desafiodesignpatternsspring.model.Client;
import br.org.jprojects.desafiodesignpatternsspring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello ModaFocks";
    }

    @GetMapping("/getAll")
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable Long id) throws Exception {
        return clientService.getById(id);
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return clientService.create(client);
    }

    @PutMapping("/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client client) throws Exception {
        return clientService.update(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws Exception {
        clientService.delete(id);
    }
}
