package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishproject.entities.Comentario;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario, Integer> {
}
