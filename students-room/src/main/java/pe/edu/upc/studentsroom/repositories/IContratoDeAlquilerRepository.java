package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IContratoDeAlquilerRepository extends JpaRepository<ContratoDeAlquiler,Integer> {
    @Query("from ContratoDeAlquiler h where h.fecha_inicio > :fechaI and h.fecha_vencimiento<:fechaF")
    List<ContratoDeAlquiler> ContratoEntreFechas(@Param("fechaI") LocalDate fechaI, @Param("fechaF") LocalDate fechaF);
}
