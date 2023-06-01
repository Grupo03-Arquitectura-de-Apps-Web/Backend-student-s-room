package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.Publicación_Favorita;

import java.util.List;

public interface IPublicacion_FavoritaService {

    public void insert(Publicación_Favorita publicacion_favorita);
    List<Publicación_Favorita> list();
    public void delete(int id_publicacion_favorita);
    public Publicación_Favorita listId(int id_publicacion_favorita);
}
