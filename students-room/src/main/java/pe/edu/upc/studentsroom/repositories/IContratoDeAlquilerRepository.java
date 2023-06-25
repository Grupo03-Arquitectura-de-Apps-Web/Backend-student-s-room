package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;

import java.util.Date;
import java.util.List;

public interface IContratoDeAlquilerRepository extends JpaRepository<ContratoDeAlquiler,Integer> {
    @Query("from ContratoDeAlquiler h where h.fecha_inicio between :fechaI and :fechaF")
    List<ContratoDeAlquiler> ContratoEntreFechas(@Param("fechaI") Date fechaI, @Param("fechaF") Date fechaF);
}
