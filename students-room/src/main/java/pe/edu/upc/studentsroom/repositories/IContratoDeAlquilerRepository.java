package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;

public interface IContratoDeAlquilerRepository extends JpaRepository<ContratoDeAlquiler,Integer> {
}
