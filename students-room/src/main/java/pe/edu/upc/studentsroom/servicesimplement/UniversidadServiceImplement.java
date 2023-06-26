package pe.edu.upc.studentsroom.servicesimplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.dtos.CantidadPorUniversidadDTO;
import pe.edu.upc.studentsroom.dtos.ConteoxEstadoDTO;
import pe.edu.upc.studentsroom.entities.Universidad;
import pe.edu.upc.studentsroom.repositories.IUniversidadRepository;
import pe.edu.upc.studentsroom.services.IUniversidadService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniversidadServiceImplement implements IUniversidadService {
    @Autowired
    private IUniversidadRepository pR;


    @Override
    public void insert(Universidad universidad) {pR.save(universidad);}

    @Override
    public List<Universidad> list() {return pR.findAll();}

    @Override
    public void delete(int idUniversidad) {pR.deleteById(idUniversidad);}


    @Override
    public Universidad listId(int idUniversidad) {
        return pR.findById(idUniversidad).orElse(new Universidad());
    }


}


