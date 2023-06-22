package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.Habitacion;
import pe.edu.upc.studentsroom.entities.Plan;

import java.util.List;

@Repository
public interface IHabitacionRepository extends JpaRepository<Habitacion,Integer> {
    //buscar habitaciones entre precios
    @Query("from Habitacion h where h.precio between :precioI and :precioF")
    List<Habitacion> habitacionEntrePrecios(@Param("precioI") float precioI,@Param("precioF") float precioF);

    //habitaciones disponibles y el distrito
    //@Query("SELECT h.distrito.ciudad.nombreCiudad,h.universidad.nombre, d.nombreDistrito FROM Habitacion h JOIN Distrito d ON h.distrito.idDistrito = d.idDistrito WHERE h.disponibilidadHabitacion = true")
    //@Query("SELECT th.descripcion,th.tipo,d.nombreDistrito,u.nombre FROM Habitacion h JOIN Distrito d ON h.distrito.idDistrito = d.idDistrito JOIN Universidad u on h.universidad.idUniversidad=u.idUniversidad join TipoHabitacion th on h.tipoHabitacion.idTipoHabitacion=th.idTipoHabitacion where h.disponibilidadHabitacion = true")
    //@Query("SELECT h FROM Habitacion h JOIN Distrito d ON h.distrito.idDistrito = d.idDistrito JOIN Universidad u on h.universidad.idUniversidad=u.idUniversidad join TipoHabitacion th on h.tipoHabitacion.idTipoHabitacion=th.idTipoHabitacion where h.disponibilidadHabitacion = true")
    @Query(value = "SELECT c.nombre_ciudad, d.nombre_distrito, count(d.id_distrito)" +
            "FROM habitaciones h " +
            "JOIN distritos d ON h.id_distrito = d.id_distrito " +
            "JOIN ciudades c ON d.id_ciudad = c.id_ciudad " +
            "WHERE h.disponibilidad_habitacion = 'Sí' " +
            "GROUP BY c.nombre_ciudad, d.nombre_distrito " +
            "ORDER BY count(d.nombre_distrito) DESC",
            nativeQuery = true)
    List<String[]> habitacionesDisponibles();

}
