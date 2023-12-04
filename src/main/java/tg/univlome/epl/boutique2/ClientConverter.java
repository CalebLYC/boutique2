/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2;

import jakarta.ws.rs.ext.ParamConverter;
import tg.univlome.epl.boutique.api.entites.Client;
import tg.univlome.epl.boutique2.services.ClientService;

/**
 *
 * @author caleb
 */
public class ClientConverter implements ParamConverter<Client>{
    
    @Override
    public Client fromString(String value) {
        if (value == null)
            return null;
        return ClientService.getInstance().recuperer(Long.parseLong(value));
    }

    @Override
    public String toString(Client value) {
        if (value == null)
            return null;
        return value.toString();
    }
}
