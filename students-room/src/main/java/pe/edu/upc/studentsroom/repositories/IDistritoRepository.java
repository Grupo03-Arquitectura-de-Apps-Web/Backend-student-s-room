package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.Distrito;

import java.util.List;

@Repository
public interface IDistritoRepository extends JpaRepository<Distrito,Integer> {

    @Query(value = "SELECT d.nombre_distrito, COUNT(d.id_distrito) AS Cantidad FROM universidades\n" +
            "JOIN habitaciones h ON universidades.id_universidad=h.id_universidad\n" +
            "JOIN distritos d ON d.id_distrito = h.id_distrito\n" +
            "GROUP BY d.id_distrito",nativeQuery = true)
    List<String[]> quantityByDistrict();

}
