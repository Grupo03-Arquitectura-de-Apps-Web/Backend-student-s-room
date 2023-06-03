package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.Publicacion;

import java.util.List;

public interface IPublicacionService {

    public void insert(Publicacion publicacion);
    List<Publicacion> list();

    public void delete(int idPublicacion);

    public Publicacion listId(int idPublicacion);
}
