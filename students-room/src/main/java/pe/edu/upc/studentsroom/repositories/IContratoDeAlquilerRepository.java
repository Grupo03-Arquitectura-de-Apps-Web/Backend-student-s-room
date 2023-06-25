package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IContratoDeAlquilerRepository extends JpaRepository<ContratoDeAlquiler,Integer> {
<<<<<<< HEAD
    @Query("from ContratoDeAlquiler h where h.fecha_inicio between :fechaI and :fechaF")
    List<ContratoDeAlquiler> ContratoEntreFechas(@Param("fechaI") Date fechaI, @Param("fechaF") Date fechaF);

    @Query(value= "SELECT e.nombre, c.fecha_pago, c.fecha_vencimiento\n" +
            "FROM estudiante e\n" +
            "JOIN contratosdealquiler c ON e.id_estudiante = c.id_estudiante\n" +
            "JOIN habitaciones h ON c.id_habitacion = h.id_habitacion\n" +
            "JOIN arrendadores a ON a.id_arrendador = h.id_arrendador\n" +
            "WHERE a.nombre = :arrendador",nativeQuery = true)

    List<String[]> ClientesDeArrendador(@Param("arrendador") String arrendador);
=======
    @Query("from ContratoDeAlquiler h where h.fecha_inicio > :fechaI and h.fecha_vencimiento<:fechaF")
    List<ContratoDeAlquiler> ContratoEntreFechas(@Param("fechaI") LocalDate fechaI, @Param("fechaF") LocalDate fechaF);
>>>>>>> master
}
