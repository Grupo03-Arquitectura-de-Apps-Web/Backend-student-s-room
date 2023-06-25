package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.Plan;

import java.util.List;

@Repository
public interface IPlanRepository extends JpaRepository<Plan, Integer> {
    @Query(value="SELECT p.nombre_plan, p.precio , count(a.id_arrendador) as arrendadores\n" +
            "from planes p \n" +
            "join arrendadores a ON p.id_plan = a.id_plan\n" +
            "group by p.nombre_plan, p.precio \n" +
            "ORDER BY COUNT(p.nombre_plan) DESC",
            nativeQuery = true)
    List<String[]> ArrendadoresPorPlan();


}
