package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.entities.Distrito;
import pe.edu.upc.studentsroom.repositories.IArrendadorRepository;
import pe.edu.upc.studentsroom.repositories.IDistritoRepository;
import pe.edu.upc.studentsroom.services.IDistritoService;

import java.util.List;

@Service
public class DistritoServiceImplement implements IDistritoService {

    @Autowired
    private IDistritoRepository dR;
    @Override
    public void insert(Distrito distrito) {
        dR.save(distrito);
    }

    @Override
    public List<Distrito> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDistrito) {
        dR.deleteById(idDistrito);
    }

    @Override
    public Distrito listId(int idDistrito) {
        return dR.findById(idDistrito).orElse(new Distrito());
    }
}
