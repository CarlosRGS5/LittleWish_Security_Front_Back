package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishproject.entities.Formacion_Academica;
@Repository
public interface IFormacion_AcademicaRepository extends JpaRepository<Formacion_Academica, Integer> {

}
