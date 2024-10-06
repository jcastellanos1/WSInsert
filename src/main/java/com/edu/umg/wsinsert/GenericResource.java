package com.edu.umg.wsinsert;

import com.edu.umg.DAO.AutorDAO;
import com.edu.umg.DAO.EstudianteDAO;
import com.edu.umg.DAO.LibroDAO;
import com.edu.umg.DAO.PrestamosDAO;
import com.edu.umg.DAO.TiposDAO;
import com.edu.umg.Entity.Autor;
import com.edu.umg.Entity.Estudiante;
import com.edu.umg.Entity.Libro;
import com.edu.umg.Entity.Prestamos;
import com.edu.umg.Entity.Tipos;
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

    private AutorDAO autorDAO = new AutorDAO();
    private LibroDAO libroDAO = new LibroDAO();
    private EstudianteDAO estudianteDAO = new EstudianteDAO();
    private PrestamosDAO prestamoDAO = new PrestamosDAO();
    private TiposDAO tipoDAO = new TiposDAO();

    public GenericResource() {
    }
//localhost:8080/WSInsert/ws/Insertar/autores
    // Autores

    @GET
    @Path("autores")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Autor> getAutores() {
        return autorDAO.getAll();
    }

    @GET
    @Path("autores/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAutorById(@PathParam("id") int id) {
        Autor autor = autorDAO.getById(id);
        if (autor != null) {
            return Response.ok(autor).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Path("autores/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addAutor(Autor autor) {
        autorDAO.save(autor);
        return Response.status(Response.Status.CREATED).entity(autor).build();
    }//localhost:8080/WSInsert/ws/Insertar/autores/agregar

    @GET
    @Path("libros")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Libro> getLibros() {
        return libroDAO.getAll();
    }

    @GET
    @Path("libros/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLibroById(@PathParam("id") int id) {
        Libro libro = libroDAO.getById(Long.MIN_VALUE);
        if (libro != null) {
            return Response.ok(libro).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Path("libros/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addLibro(Libro libro) {
        libroDAO.save(libro);
        return Response.status(Response.Status.CREATED).entity(libro).build();
    }//localhost:8080/WSInsert/ws/Insertar/libros/agregar

    // Estudiantes
    @GET
    @Path("estudiantes")
    @Produces(MediaType.APPLICATION_JSON)
        public List<Estudiante> getEstudiantes() {
        return estudianteDAO.getAll();
    }

    @GET
    @Path("estudiantes/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEstudianteById(@PathParam("id") int id) {
            Estudiante estudiante = estudianteDAO.getById(id);
        if (estudiante != null) {
            return Response.ok(estudiante).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Path("estudiantes/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addEstudiante(Estudiante estudiante) {
        estudianteDAO.save(estudiante);
        return Response.status(Response.Status.CREATED).entity(estudiante).build();
    }//localhost:8080/WSInsert/ws/Insertar/estudiantes/agregar

    // Prestamos
    @GET
    @Path("prestamos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prestamos> getPrestamos() {
        return prestamoDAO.getAllPrestamos();
    }

    @GET
    @Path("prestamos/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPrestamoById(@PathParam("id") int id) {
        Prestamos prestamo = prestamoDAO.getPrestamoById(Long.MIN_VALUE);
        if (prestamo != null) {
            return Response.ok(prestamo).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Path("prestamos/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPrestamo(Prestamos prestamo) {
        prestamoDAO.savePrestamo(prestamo);
        return Response.status(Response.Status.CREATED).entity(prestamo).build();
    }//localhost:8080/WSInsert/ws/Insertar/prestamos/agregar

    // Tipos
    @GET
    @Path("tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tipos> getTipos() {
        return tipoDAO.getAll();
    }

    @GET
    @Path("tipos/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTipoById(@PathParam("id") int id) {
        Tipos tipo = tipoDAO.getById(id);
        if (tipo != null) {
            return Response.ok(tipo).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Path("tipos/agregar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addTipo(Tipos tipo) {
        tipoDAO.save(tipo);
        return Response.status(Response.Status.CREATED).entity(tipo).build();
    }//localhost:8080/WSInsert/ws/Insertar/tipos/agregar

}
