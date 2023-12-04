/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.boutique.api.entites.Categorie;
import tg.univlome.epl.boutique.api.entites.Produit;

/**
 *
 * @author caleb
 */
public class ProduitService {

    private  List<Produit> list;
    private static ProduitService instance;

    private ProduitService() {
        list = new ArrayList<>();
        Categorie c1 = new Categorie(1, "Savon", "");
        Categorie c2 = new Categorie(2, "Boison", "");  
        list.add(new Produit(1, "Fanico", 200, LocalDate.of(2025, 5,1), c1));
        list.add(new Produit(2, "Kdo", 500, LocalDate.of(2024, 4,6), c1));
        list.add(new Produit(3, "Awouyo", 650, LocalDate.of(2026, 11,6), c2));
        list.add(new Produit(4, "Sodabi", 1200, LocalDate.of(2026, 2,10), c2));
        list.add(new Produit(5, "Tchoucoutou", 100, LocalDate.of(2024, 7,21), c2));

    }

    public synchronized static ProduitService getInstance() {
        if (ProduitService.instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    public void ajouter(Produit p) {
        this.list.add(p);
    }

    public void modifier(Produit p) {
        int i=0;
        for (Produit produit : list) {
            if (produit.equals(p)) {
                list.set(i, p);
                break;
            }
            i++;
        }
    }
    
    public void supprimer(Produit p){
        list.remove(p);
    }

    public Produit recuperer(long id) {
        for (Produit produit : list) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    public int compter() {
        return list.size();
    }

    public List<Produit> lister() {
        return list;
    }
}
