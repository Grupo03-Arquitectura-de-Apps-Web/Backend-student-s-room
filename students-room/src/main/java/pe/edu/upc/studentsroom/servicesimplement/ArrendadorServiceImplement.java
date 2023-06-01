package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.entities.Arrendador;
import pe.edu.upc.studentsroom.repositories.IArrendadorRepository;
import pe.edu.upc.studentsroom.services.IArrendadorService;

import java.util.List;

@Service
public class ArrendadorServiceImplement implements IArrendadorService {
    @Autowired
    private IArrendadorRepository aR;

    @Override
    public void insert(Arrendador arrendador) {
        aR.save(arrendador);
    }

    @Override
    public List<Arrendador> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int id_arrendador) {
        aR.deleteById(id_arrendador);
    }

    @Override
    public Arrendador listId(int id_arrendador) {
        return aR.findById(id_arrendador).orElse(new Arrendador());
    }
}
