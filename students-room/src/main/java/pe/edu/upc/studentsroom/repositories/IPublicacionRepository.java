package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.studentsroom.entities.Publicacion;

public interface IPublicacionRepository extends JpaRepository<Publicacion,Integer> {
}
