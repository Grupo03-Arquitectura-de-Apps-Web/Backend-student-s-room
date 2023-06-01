package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.entities.Publicación_Favorita;
import pe.edu.upc.studentsroom.repositories.IPublicacion_FavoritaRepository;
import pe.edu.upc.studentsroom.services.IPublicacion_FavoritaService;

import java.util.List;

@Service
public class PublicacionFavoritaServiceImplement implements IPublicacion_FavoritaService {

    @Autowired
    private IPublicacion_FavoritaRepository pfR;

    @Override
    public void insert(Publicación_Favorita publicacion_favorita) {
        pfR.save(publicacion_favorita);
    }

    @Override
    public List<Publicación_Favorita> list() {
        return pfR.findAll();
    }

    @Override
    public void delete(int id_publicacion_favorita) {
        pfR.deleteById(id_publicacion_favorita);
    }

    @Override
    public Publicación_Favorita listId(int id_publicacion_favorita) {
        return pfR.findById(id_publicacion_favorita).orElse(new Publicación_Favorita());
    }
}
