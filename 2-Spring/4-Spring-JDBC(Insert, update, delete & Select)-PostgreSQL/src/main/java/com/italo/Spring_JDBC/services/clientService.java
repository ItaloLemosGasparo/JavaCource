package com.italo.Spring_JDBC.services;

import com.italo.Spring_JDBC.models.client;
import com.italo.Spring_JDBC.repositories.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class clientService {
    private static clientRepository clientRepo;

    public clientRepository getClientRepo() {
        return clientRepo;
    }

    @Autowired
    public void setClientRepo(clientRepository clientRepo) {
        this.clientRepo = clientRepo;
    }

    public static void addClient(client cli) {
        clientRepo.save(cli);
    }

    public static List<client> getClients() {
        return clientRepo.findAll();
    }

    public void deleteClient(int cli) {
        clientRepo.delete(cli);
    }

    public void updateClient(client cli) {
        clientRepo.update(cli);
    }
}
