package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aaw.littlewishproject.dtos.CurriculumVitaeDTO;
import pe.edu.upc.aaw.littlewishproject.entities.CurriculumVitae;

public interface ICurriculumVitaeRepository extends JpaRepository<CurriculumVitae, Integer> {
}
