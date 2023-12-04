/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.services;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.boutique.api.entites.Employe;

/**
 *
 * @author caleb
 */
public class EmployeService {

    private List<Employe> list;
    private static EmployeService instance;

    private EmployeService() {
        this.list = new ArrayList<>();

    }

    public synchronized static EmployeService getInstance() {
        if (EmployeService.instance == null) {
            instance = new EmployeService();
        }
        return instance;
    }

    public void ajouter(Employe e) {
        this.list.add(e);
    }

    public void modifier(Employe e) {
        int i = 0;
        for (Employe employe : list) {
            if (employe.equals(e)) {
                list.set(i, e);
            }
            i++;
        }
    }
    
    public void supprimer(Employe e){
        list.remove(e);
    }

    public Employe recuperer(long id) {
        for (Employe employe : list) {
            if (employe.getId() == id) {
                return employe;
            }
        }
        return null;
    }

    public int compter() {
        return list.size();
    }

    public List<Employe> lister() {
        return list;
    }
}
