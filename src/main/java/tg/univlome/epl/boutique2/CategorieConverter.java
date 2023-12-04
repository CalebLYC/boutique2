/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2;

import jakarta.ws.rs.ext.ParamConverter;
import tg.univlome.epl.boutique.api.entites.Categorie;
import tg.univlome.epl.boutique2.services.CategorieService;

/**
 *
 * @author caleb
 */
public class CategorieConverter implements ParamConverter<Categorie>{
    
    @Override
    public Categorie fromString(String value) {
        if (value == null)
            return null;
        return CategorieService.getInstance().recuperer(Long.parseLong(value));
    }

    @Override
    public String toString(Categorie value) {
        if (value == null)
            return null;
        return value.toString();
    }
}
