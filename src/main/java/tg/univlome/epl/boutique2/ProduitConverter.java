/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2;

import jakarta.ws.rs.ext.ParamConverter;
import tg.univlome.epl.boutique.api.entites.Produit;
import tg.univlome.epl.boutique2.services.ProduitService;

/**
 *
 * @author caleb
 */
public class ProduitConverter implements ParamConverter<Produit>{
    
    @Override
    public Produit fromString(String value) {
        if (value == null)
            return null;
        return ProduitService.getInstance().recuperer(Long.parseLong(value));
    }

    @Override
    public String toString(Produit value) {
        if (value == null)
            return null;
        return value.toString();
    }
}
