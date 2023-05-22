package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Integer> {
}
