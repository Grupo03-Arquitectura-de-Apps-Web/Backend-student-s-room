package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IContratoDeAlquilerRepository extends JpaRepository<ContratoDeAlquiler,Integer> {
    @Query("from ContratoDeAlquiler h where h.fecha_inicio between :fechaI and :fechaF")
    List<ContratoDeAlquiler> ContratoEntreFechas(@Param("fechaI") Date fechaI, @Param("fechaF") Date fechaF);

    @Query(value= "SELECT a.nombre as Nombre_arrendador, e.nombre, e.telefono, h.ubicacion\n" +
            "            FROM estudiante e \n" +
            "            JOIN contratosdealquiler c ON e.id_estudiante = c.id_estudiante\n" +
            "            JOIN habitaciones h ON c.id_habitacion = h.id_habitacion\n" +
            "            JOIN arrendadores a ON a.id_arrendador = h.id_arrendador\n" +
            "            ORDER BY a.nombre DESC", nativeQuery = true)

    List<String[]> ClientesDeArrendador();
    @Query("from ContratoDeAlquiler h where h.fecha_inicio > :fechaI and h.fecha_vencimiento<:fechaF")
    List<ContratoDeAlquiler> ContratoEntreFechas(@Param("fechaI") LocalDate fechaI, @Param("fechaF") LocalDate fechaF);
}
