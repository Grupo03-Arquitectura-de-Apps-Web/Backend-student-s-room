package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.Mensaje;

import java.util.List;

@Repository
public interface IMensajeRepository extends JpaRepository<Mensaje,Integer> {

    @Query(value = "SELECT m.estado, COUNT(estado) AS conteo \n" +
            "FROM mensajes m \n"+
            "GROUP BY estado \n" +
            "ORDER BY conteo DESC",
            nativeQuery = true)
    List<String[]> ConteodeMensajesporEstado();
}
