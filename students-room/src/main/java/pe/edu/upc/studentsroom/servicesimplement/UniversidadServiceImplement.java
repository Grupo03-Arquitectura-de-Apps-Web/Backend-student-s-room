package pe.edu.upc.studentsroom.servicesimplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.entities.TipoHabitacion;
import pe.edu.upc.studentsroom.entities.Universidad;
import pe.edu.upc.studentsroom.repositories.IUniversidadRepository;
import pe.edu.upc.studentsroom.services.IUniversidadService;

import java.util.List;

@Service
public class UniversidadServiceImplement implements IUniversidadService {
    @Autowired
    private IUniversidadRepository pR;


    @Override
    public void insert(Universidad universidad) {
    }

    @Override
    public List<Universidad> list() {
        return null;
    }

    @Override
    public void delete(int idUniversidad) {

    }

    @Override
    public Universidad listId(int idUniversidad) {
        return null;
    }
}

