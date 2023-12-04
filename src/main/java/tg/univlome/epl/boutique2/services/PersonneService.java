/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.services;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.boutique.api.entites.Personne;

/**
 *
 * @author caleb
 */
public class PersonneService {

    private  List<Personne> list;
    private static PersonneService instance;

    private PersonneService() {
        this.list = new ArrayList<>();

    }

    public synchronized static PersonneService getInstance() {
        if (PersonneService.instance == null) {
            instance = new PersonneService();
        }
        return instance;
    }

    public void ajouter(Personne p) {
        this.list.add(p);
    }

    public void modifier(Personne p) {
        int i = 0;
        for (Personne personne : list) {
            if (personne.equals(p)) {
                list.set(i, p);
            }
            i++;
        }
    }

    public Personne recuperer(long id) {
        for (Personne personne : list) {
            if (personne.getId() == id) {
                return personne;
            }
        }
        return null;
    }
    
    public void supprimer(Personne e){
        list.remove(e);
    }

    public int compter() {
        return list.size();
    }

    public List<Personne> lister() {
        return list;
    }
}
