package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.Distrito;

@Repository
public interface IDistritoRepository extends JpaRepository<Distrito,Integer> {
}
