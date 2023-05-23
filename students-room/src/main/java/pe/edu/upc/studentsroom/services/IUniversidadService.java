package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.Universidad;
import java.util.List;

public interface IUniversidadService {

    public void insert(Universidad universidad);
    List<Universidad> list();
}
