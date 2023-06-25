package pe.edu.upc.studentsroom.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.Estudiante;

import java.util.List;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante,Integer> {

    @Query("SELECT e FROM Estudiante e WHERE e.correo_institucional LIKE %:busqueda%")
    List<Estudiante> findByCorreo(@Param("busqueda") String busqueda);

    @Query(value = "SELECT e.nombre, count(m.id_mensaje) from estudiante e \n" +
            "join mensajes m ON e.id_estudiante = m.id_estudiante \n" +
            "group by e.nombre ORDER BY COUNT(e.nombre) DESC", nativeQuery = true)
    List<String[]> getCountMessagesPerStudent();
}
