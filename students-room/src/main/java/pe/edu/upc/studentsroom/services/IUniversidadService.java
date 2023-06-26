package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.dtos.CantidadPorUniversidadDTO;
import pe.edu.upc.studentsroom.dtos.ConteoxEstadoDTO;
import pe.edu.upc.studentsroom.entities.TipoHabitacion;
import pe.edu.upc.studentsroom.entities.Universidad;
import java.util.List;

public interface IUniversidadService {

    public void insert(Universidad universidad);
    List<Universidad> list();
    public void delete(int idUniversidad);
    public Universidad listId(int idUniversidad);

}
