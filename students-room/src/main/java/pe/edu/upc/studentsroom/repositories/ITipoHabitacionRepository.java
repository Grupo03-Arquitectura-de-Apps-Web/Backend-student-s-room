package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.TipoHabitacion;

@Repository
public interface ITipoHabitacionRepository extends JpaRepository <TipoHabitacion,Integer>{
}
