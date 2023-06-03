package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.entities.Publicacion;
import pe.edu.upc.studentsroom.repositories.IPublicacionRepository;
import pe.edu.upc.studentsroom.services.IPublicacionService;

import java.util.List;

@Service
public class PublicacionServiceImplement implements IPublicacionService {

    @Autowired
    private IPublicacionRepository pR;

    @Override
    public void insert(Publicacion publicacion) {
        pR.save(publicacion);
    }

    @Override
    public List<Publicacion> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPublicacion) {
        pR.deleteById(idPublicacion);
    }

    @Override
    public Publicacion listId(int idPublicacion) {
        return pR.findById(idPublicacion).orElse(new Publicacion());
    }
}
