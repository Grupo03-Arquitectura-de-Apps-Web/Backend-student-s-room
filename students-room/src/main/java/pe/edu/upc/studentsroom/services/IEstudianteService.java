
package pe.edu.upc.studentsroom.services;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.entities.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public void insert(Estudiante estudiante);
    List<Estudiante> list();

    List<Estudiante> findByCorreo(String busqueda);

    public void delete(int idEstudiante);

    public Estudiante listId(int idEstudiante);
}
