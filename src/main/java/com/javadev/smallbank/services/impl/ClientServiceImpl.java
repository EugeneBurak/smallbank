package com.javadev.smallbank.services.impl;

import com.javadev.smallbank.entity.Client;
import com.javadev.smallbank.repository.ClientRepository;
import com.javadev.smallbank.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        Client savedClient = clientRepository.save(client);
        return savedClient;
    }

    @Override
    public void deleteClient(int id) {
        clientRepository.delete(id);
    }

    @Override
    public Client getClientById(int id) {
        return clientRepository.findOne(id);
    }

    @Override
    public Client editClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        List<Client> list = new ArrayList<>();
        for (Client client : clientRepository.findAll()) {
            list.add(client);
        }
        return list;
    }
}
