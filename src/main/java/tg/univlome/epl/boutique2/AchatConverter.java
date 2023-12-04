/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2;

import jakarta.ws.rs.ext.ParamConverter;
import tg.univlome.epl.boutique.api.entites.Achat;
import tg.univlome.epl.boutique2.services.AchatService;

/**
 *
 * @author caleb
 */
public class AchatConverter implements ParamConverter<Achat>{
    
    @Override
    public Achat fromString(String value) {
        if (value == null)
            return null;
        return AchatService.getInstance().recuperer(Long.parseLong(value));
    }

    @Override
    public String toString(Achat value) {
        if (value == null)
            return null;
        return value.toString();
    }
}
