package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishproject.entities.Puntuacion;

@Repository
public interface IPuntuacionRepository extends JpaRepository <Puntuacion, Integer>{
}
