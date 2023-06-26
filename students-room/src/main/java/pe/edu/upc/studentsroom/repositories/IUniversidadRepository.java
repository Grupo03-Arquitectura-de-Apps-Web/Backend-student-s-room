package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.Universidad;

import java.util.List;

@Repository
public interface IUniversidadRepository extends JpaRepository<Universidad, Integer> {



}
