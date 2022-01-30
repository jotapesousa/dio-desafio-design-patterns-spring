package br.org.jprojects.desafiodesignpatternsspring.service;

import br.org.jprojects.desafiodesignpatternsspring.model.Client;
import br.org.jprojects.desafiodesignpatternsspring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }


    public Client getById(Long id) throws Exception {
        Optional<Client> clientOptional = clientRepository.findById(id);

        if (clientOptional.isPresent())
            return clientOptional.get();
        else {
            throw new Exception("Cliente não encontrado na base de dados!");
        }
    }


    public Client create(Client client) {
        return clientRepository.save(client);
    }


    public Client update(Client client) throws Exception {

        Optional<Client> clientOptional = clientRepository.findById(client.getId());

        if (clientOptional.isPresent()) {
            return clientRepository.save(client);
        }
        throw new Exception("Cliente não encontrado na base de dados!");
    }


    public void delete(Long id) throws Exception {
        Optional<Client> clientOptional = clientRepository.findById(id);

        if (clientOptional.isPresent()) {
            clientRepository.delete(clientOptional.get());
            return;
        }
        throw new Exception("Cliente não encontrado na base de dados!");
    }
}
