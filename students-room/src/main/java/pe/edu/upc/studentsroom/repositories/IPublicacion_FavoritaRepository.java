package pe.edu.upc.studentsroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.studentsroom.entities.Publicación_Favorita;

@Repository
public interface IPublicacion_FavoritaRepository extends JpaRepository<Publicación_Favorita,Integer> {
}
