/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2;

import jakarta.ws.rs.ext.ParamConverter;
import jakarta.ws.rs.ext.ParamConverterProvider;
import jakarta.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import tg.univlome.epl.boutique.api.entites.Achat;

/**
 *
 * @author caleb
 */
@Provider
public class AchatParamConverterProvider implements ParamConverterProvider {

    @Override
    public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType,
            Annotation[] annotations) {
        if (rawType.equals(Achat.class))
            return (ParamConverter<T>) new AchatConverter();
        return null;
    }

}
