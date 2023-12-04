/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.services;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.boutique.api.entites.Client;

/**
 *
 * @author caleb
 */
public class ClientService {

    private  List<Client> list;
    private static ClientService instance;

    private ClientService() {
        this.list = new ArrayList<>();

    }

    public synchronized static ClientService getInstance() {
        if (ClientService.instance == null) {
            instance = new ClientService();
        }
        return instance;
    }

    public void ajouter(Client c) {
        this.list.add(c);
    }

    public void modifier(Client c) {
        int i = 0;
        for (Client client : list) {
            if (client.equals(c)) {
               list.set(i, c);
            }
            i++;
        }
    }
    
    public void supprimer(Client c){
        list.remove(c);
    }

    public Client recuperer(long id) {
        for (Client client : list) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }

    public int compter() {
        return list.size();
    }

    public List<Client> lister() {
        return list;
    }
}
