package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.TipoHabitacion;

import java.util.List;

@Repository
public interface ITipoHabitacionRepository extends JpaRepository <TipoHabitacion,Integer>{
    @Query("from TipoHabitacion t where t.tipo=:tipo")
    List<TipoHabitacion> buscarTipoHabitacion(@Param("tipo") String tipo);

    @Query("select count (t) from  TipoHabitacion t where t.tipo='Habitacion Doble'")
    int contadorPorTipoHabitacion();
}
