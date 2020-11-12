package com.example.service;

import com.example.entity.Client;
import org.springframework.http.ResponseEntity;

public interface ClientService {

    Client createClient(Client client);
    Client getClientById(Long id);
    Client updateClient(Long id, Client client);
    ResponseEntity<?> deleteClient(Long id);
    Client getClientByUsernameAndPassword(String username, String password);
    Client getClientByUsernameAndEmail(String username, String email);
}
