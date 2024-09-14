package com.edu.umg.wsinsert;

import com.edu.umg.biblioteca.entity.autores;
import com.edu.umg.biblioteca.entity.estudiantes;
import com.edu.umg.biblioteca.entity.libros;
import com.edu.umg.biblioteca.entity.prestamos;
import com.edu.umg.biblioteca.entity.tipos;
import com.edu.umg.bliblioteca.dao.AutorDAO;
import com.edu.umg.bliblioteca.dao.EstudianteDAO;
import com.edu.umg.bliblioteca.dao.LibroDAO;
import com.edu.umg.bliblioteca.dao.PrestamoDAO;
import com.edu.umg.bliblioteca.dao.TipoDAO;
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
    private PrestamoDAO prestamoDAO = new PrestamoDAO();
    private TipoDAO tipoDAO = new TipoDAO();

    public GenericResource() {
    }
//localhost:8080/WSInsert/ws/Insertar/autores
    // Autores

    @GET
    @Path("autores")
    @Produces(MediaType.APPLICATION_JSON)
    public List<autores> getAutores() {
        return autorDAO.getAllAutores();
    }

    @GET
    @Path("autores/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAutorById(@PathParam("id") int id) {
        autores autor = autorDAO.getAutorById(id);
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
    public Response addAutor(autores autor) {
        autorDAO.addAutor(autor);
        return Response.status(Response.Status.CREATED).entity(autor).build();
    }//localhost:8080/WSInsert/ws/Insertar/autores/agregar

    @GET
    @Path("libros")
    @Produces(MediaType.APPLICATION_JSON)
    public List<libros> getLibros() {
        return libroDAO.getAllLibros();
    }

    @GET
    @Path("libros/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLibroById(@PathParam("id") int id) {
        libros libro = libroDAO.getLibroById(id);
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
    public Response addLibro(libros libro) {
        libroDAO.addLibro(libro);
        return Response.status(Response.Status.CREATED).entity(libro).build();
    }//localhost:8080/WSInsert/ws/Insertar/libros/agregar

    // Estudiantes
    @GET
    @Path("estudiantes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<estudiantes> getEstudiantes() {
        return estudianteDAO.getAllEstudiantes();
    }

    @GET
    @Path("estudiantes/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEstudianteById(@PathParam("id") int id) {
        estudiantes estudiante = estudianteDAO.getEstudianteById(id);
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
    public Response addEstudiante(estudiantes estudiante) {
        estudianteDAO.addEstudiante(estudiante);
        return Response.status(Response.Status.CREATED).entity(estudiante).build();
    }//localhost:8080/WSInsert/ws/Insertar/estudiantes/agregar

    // Prestamos
    @GET
    @Path("prestamos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<prestamos> getPrestamos() {
        return prestamoDAO.getAllPrestamos();
    }

    @GET
    @Path("prestamos/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPrestamoById(@PathParam("id") int id) {
        prestamos prestamo = prestamoDAO.getPrestamoById(id);
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
    public Response addPrestamo(prestamos prestamo) {
        prestamoDAO.addPrestamo(prestamo);
        return Response.status(Response.Status.CREATED).entity(prestamo).build();
    }//localhost:8080/WSInsert/ws/Insertar/prestamos/agregar

    // Tipos
    @GET
    @Path("tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<tipos> getTipos() {
        return tipoDAO.getAllTipos();
    }

    @GET
    @Path("tipos/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTipoById(@PathParam("id") int id) {
        tipos tipo = tipoDAO.getTipoById(id);
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
    public Response addTipo(tipos tipo) {
        tipoDAO.addTipo(tipo);
        return Response.status(Response.Status.CREATED).entity(tipo).build();
    }//localhost:8080/WSInsert/ws/Insertar/tipos/agregar

}
