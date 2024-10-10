package com.edu.umg.wsinsert;

import com.edu.umg.controller.AutorController;
import com.edu.umg.controller.LibroController;
import com.edu.umg.controller.PersonalController;
import com.edu.umg.controller.PrestamoController;
import com.edu.umg.controller.PuestoController;
import com.edu.umg.controller.TipoController;
import com.edu.umg.controller.UsuarioController;
import com.edu.umg.model.Autor;
import com.edu.umg.model.Libro;
import com.edu.umg.model.Personal;
import com.edu.umg.model.Prestamo;
import com.edu.umg.model.Puesto;
import com.edu.umg.model.Tipo;
import com.edu.umg.model.Usuario;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Path("Insertar")
public class GenericResource {

    @Context
    private UriInfo context;

    private AutorController autorController = new AutorController();
    private LibroController libroController = new LibroController();
    private UsuarioController usuarioController = new UsuarioController();
    private PrestamoController prestamosController = new PrestamoController();
    private TipoController tiposController = new TipoController();
    private PuestoController puestoController = new PuestoController();
    private PersonalController personalController = new PersonalController();

    public GenericResource() {
    }
//localhost:8080/WSInsert/ws/Insertar/autores
    // Autores

    @POST
    @Path("autores/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addAutor(Autor autor) {
        autorController.createAutor(autor);
        return Response.status(Response.Status.CREATED).entity(autor).build();
    }//localhost:8080/WSInsert/ws/Insertar/autores/agregar

    @POST
    @Path("libros/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addLibro(Libro libro) {
        libroController.createLibro(libro);
        return Response.status(Response.Status.CREATED).entity(libro).build();
    }//localhost:8080/WSInsert/ws/Insertar/libros/agregar

    // Usuarios
    @POST
    @Path("usuarios/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addEstudiante(Usuario usuario) {
        usuarioController.createUsuario(usuario);
        return Response.status(Response.Status.CREATED).entity(usuario).build();
    }//localhost:8080/WSInsert/ws/Insertar/usuarios/agregar

    // Prestamos
    @POST
    @Path("prestamos/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPrestamo(Prestamo prestamo) {
        prestamosController.createPrestamo(prestamo);
        return Response.status(Response.Status.CREATED).entity(prestamo).build();
    }//localhost:8080/WSInsert/ws/Insertar/prestamos/agregar

    // Tipos
    @POST
    @Path("tipos/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addTipo(Tipo tipo) {
        tiposController.createTipo(tipo);
        return Response.status(Response.Status.CREATED).entity(tipo).build();
    }//localhost:8080/WSInsert/ws/Insertar/tipos/agregar

    @GET
    @Path("puestos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Puesto> getPuestos() {
        return puestoController.getAllPuestos();
    }

    @POST
    @Path("puestos/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPuesto(Puesto puesto) {
        puestoController.createPuesto(puesto);
        return Response.status(Response.Status.CREATED).entity(puesto).build();
    }
// localhost:8080/WSInsert/ws/Insertar/puestos/agregar

    @GET
    @Path("personal")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Personal> getPersonal() {
        return personalController.getAllPersonal();
    }
    
    @POST
    @Path("personal/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPersonal(Personal personal) {
        personalController.createPersonal(personal);
        return Response.status(Response.Status.CREATED).entity(personal).build();
    }
// localhost:8080/WSInsert/ws/Insertar/personal/agregar

}
