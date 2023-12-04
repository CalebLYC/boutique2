/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import tg.univlome.epl.boutique.api.entites.Categorie;
import tg.univlome.epl.boutique2.services.CategorieService;

/**
 *
 * @author caleb
 */

@Path("/categorie")
public class CategorieRessource {

    private final CategorieService service = CategorieService.getInstance();

    public CategorieRessource() {

    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void ajouter(Categorie c) {
        this.service.ajouter(c);
    }

    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void modifier(Categorie c) {
        this.service.modifier(c);
    }

    @DELETE
    public void supprimer(@QueryParam("id") Long id) {
        this.service.supprimer(service.recuperer(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Categorie recuperer(@PathParam("id") long id) {
        Categorie categorie = this.service.recuperer(id);
        return categorie;
    }

    @GET
    @Path("/compter")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public int compter() {
        return this.service.compter();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Categorie> lister() {
        return this.service.lister();
    }
}
