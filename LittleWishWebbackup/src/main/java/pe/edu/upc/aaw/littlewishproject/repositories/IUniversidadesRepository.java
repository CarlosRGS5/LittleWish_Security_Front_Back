package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishproject.dtos.UniversidadesCarrerasDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Universidades;

import java.util.List;

@Repository
public interface IUniversidadesRepository extends JpaRepository<Universidades, Integer> {
    @Query(value = "SELECT COUNT(*) FROM Universidades", nativeQuery = true)
    Long contarUniversidades();
}
