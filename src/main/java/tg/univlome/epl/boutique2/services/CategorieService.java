/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.services;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.boutique.api.entites.Categorie;

/**
 *
 * @author caleb
 */
public class CategorieService {

    private List<Categorie> list;
    private static CategorieService instance;

    private CategorieService() {
        this.list = new ArrayList<>();
        this.list.add(new Categorie(1,"Cosmétique", "Description"));
        this.list.add(new Categorie(2,"Habillement", "Description"));
        this.list.add(new Categorie(3,"Education", "Description"));

    }

    public synchronized static CategorieService getInstance() {
        if (CategorieService.instance == null) {
            instance = new CategorieService();
        }
        return instance;
    }

    public void ajouter(Categorie c) {
        this.list.add(c);
    }

    public void modifier(Categorie c) {
        int i = 0;
        for (Categorie categorie : list) {
            if (categorie.equals(c)) {
                list.set(i, c);
            }
            i++;
        }
    }

    public void supprimer(Categorie c){
         list.remove(c);
    }
    
    public Categorie recuperer(long id) {
        for (Categorie categorie : list) {
            if (categorie.getId() == id) {
                return categorie;
            }
        }
        return null;
    }

    public int compter() {
        return list.size();
    }

    public List<Categorie> lister() {
        return list;
    }
}
