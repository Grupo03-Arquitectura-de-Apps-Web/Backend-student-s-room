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
}
