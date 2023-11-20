package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.aaw.littlewishproject.dtos.CurriculumVitaeDTO;
import pe.edu.upc.aaw.littlewishproject.entities.CurriculumVitae;

import java.util.List;

public interface ICurriculumVitaeRepository extends JpaRepository<CurriculumVitae, Integer> {

    @Query(value = "SELECT COUNT(*) user_id\n" +
            "FROM curriculum_vitae",nativeQuery = true)
    public List<String[]> quantityTotalUsersWithCV();
}
