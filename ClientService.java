/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.dad.boutique.Client;

/**
 *
 * @author user
 */
public class ClientService {
    private static ClientService instance;
    private List<Client> clients = new ArrayList<>();

    private ClientService() {}

    public static synchronized ClientService getInstance() {
        if (instance == null) {
            instance = new ClientService();
        }
        return instance;
    }

    public void ajouter(Client c) {
        clients.add(c);
    }

    public void supprimer(Client c) {
        clients.remove(c);
    }

    public List<Client> lister() {
        return clients;
    }

    public Client chercherParId(long id) {
        for (Client c : clients) {
            if (c.getId() == id) return c;
        }
        return null;
    }
}

