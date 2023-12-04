/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2;

import jakarta.ws.rs.ext.ParamConverter;
import java.time.LocalDate;

/**
 *
 * @author caleb
 */
public class LocalDateConverter implements ParamConverter<LocalDate>{
    
    @Override
    public LocalDate fromString(String value) {
        if (value == null)
            return null;
        return LocalDate.parse(value);
    }

    @Override
    public String toString(LocalDate value) {
        if (value == null)
            return null;
        return value.toString();
    }
}
