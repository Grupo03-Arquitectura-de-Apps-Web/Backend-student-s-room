package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.Ciudad;
import pe.edu.upc.studentsroom.entities.Distrito;
import pe.edu.upc.studentsroom.entities.Habitacion;

import java.util.List;

public interface IDistritoService {
    public void insert(Distrito distrito);
    List<Distrito> list();
    public void delete(int idDistrito);

    public Distrito listId(int idDistrito);
}
