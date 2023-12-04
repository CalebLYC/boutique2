/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.services;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.boutique.api.entites.ProduitAchete;

/**
 *
 * @author caleb
 */
public class ProduitAcheteService {

    private  List<ProduitAchete> list;
    private static ProduitAcheteService instance;

    private ProduitAcheteService() {
        this.list = new ArrayList<>();

    }

    public synchronized static ProduitAcheteService getInstance() {
        if (ProduitAcheteService.instance == null) {
            instance = new ProduitAcheteService();
        }
        return instance;
    }

    public void ajouter(ProduitAchete p) {
        this.list.add(p);
    }
    

    public void modifier(ProduitAchete p) {
        int i = 0;
        for (ProduitAchete produitAchete : list) {
            if (produitAchete.equals(p)) {
                list.set(i, p);
            }
            i++;
        }
    }
    
    public void supprimer(ProduitAchete p){
        list.remove(p);
    }

    
    public ProduitAchete recuperer(Long id) {
    for (ProduitAchete produitAchete : list) {
            if (produitAchete.getId() == id) {
                return produitAchete;
            }
        }
        return null;
    }

    public int compter() {
        return list.size();
    }

    public List<ProduitAchete> lister() {
        return list;
    }

}
