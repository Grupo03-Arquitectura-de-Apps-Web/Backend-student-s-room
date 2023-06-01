package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.Plan;

import java.util.List;

@Repository
public interface IPlanRepository extends JpaRepository<Plan, Integer> {
    @Query("from Plan p where p.nombre_plan=:nombre_plan")
    List<Plan> buscarPlan(@Param("nombre_plan") String nombre_plan);

    @Query("select count (p) from  Plan p where p.precio>10")
    int contador();
}
