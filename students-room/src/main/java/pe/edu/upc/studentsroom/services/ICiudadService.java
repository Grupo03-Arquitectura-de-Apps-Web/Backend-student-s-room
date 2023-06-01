package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.Ciudad;
import pe.edu.upc.studentsroom.entities.Distrito;
import pe.edu.upc.studentsroom.entities.Estudiante;

import java.util.List;

public interface ICiudadService {
    public void insert(Ciudad ciudad);
    List<Ciudad> list();
    public void delete(int idCiudad);

    public Ciudad listId(int idCiudad);
}
