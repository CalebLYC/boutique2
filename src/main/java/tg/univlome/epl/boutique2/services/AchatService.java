/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.services;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.boutique.api.entites.Achat;

/**
 *
 * @author caleb
 */
public class AchatService {

    private List<Achat> list;
    private static AchatService instance;

    private AchatService() {
        this.list = new ArrayList<>();

    }

    public synchronized static AchatService getInstance() {
        if (AchatService.instance == null) {
            instance = new AchatService();
        }
        return instance;
    }

    public void ajouter(Achat a) {
        this.list.add(a);
    }

    public void modifier(Achat a) {
        int i = 0;
        for (Achat achat : list) {
            if (achat.equals(a)) {
                list.set(i, a);
            }
            i++;
        }
    }

    public void supprimer(Achat a) {
        list.remove(a);
    }

    public Achat recuperer(long id) {
        for (Achat achat : list) {
            if (achat.getId() == id) {
                return achat;
            }
        }
        return null;
    }

    public int compter() {
        return list.size();
    }

    public List<Achat> lister() {
        return list;
    }
}
