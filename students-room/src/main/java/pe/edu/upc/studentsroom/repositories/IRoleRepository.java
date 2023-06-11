package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.studentsroom.entities.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}
