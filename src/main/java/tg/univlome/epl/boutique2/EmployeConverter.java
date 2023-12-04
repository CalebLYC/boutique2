/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2;

import jakarta.ws.rs.ext.ParamConverter;
import tg.univlome.epl.boutique.api.entites.Employe;
import tg.univlome.epl.boutique2.services.EmployeService;

/**
 *
 * @author caleb
 */
public class EmployeConverter implements ParamConverter<Employe>{
    
    @Override
    public Employe fromString(String value) {
        if (value == null)
            return null;
        return EmployeService.getInstance().recuperer(Long.parseLong(value));
    }

    @Override
    public String toString(Employe value) {
        if (value == null)
            return null;
        return value.toString();
    }
}
