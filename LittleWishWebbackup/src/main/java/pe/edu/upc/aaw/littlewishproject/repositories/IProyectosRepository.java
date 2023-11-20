package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishproject.entities.Proyectos;

import java.util.List;

@Repository
public interface IProyectosRepository extends JpaRepository<Proyectos, Integer> {
    @Query(value = "SELECT u.name AS user_name, COUNT(p.idproyecto) AS project_count\n" +
            "FROM users u\n" +
            "LEFT JOIN proyectos p ON u.id = p.user_id\n" +
            "LEFT JOIN role r ON u.id = r.user_id\n" +
            "WHERE r.rol = 'DESARROLLADOR'\n" +
            "GROUP BY u.id;",nativeQuery = true)
    public List<String[]> quantityProyectDesarrollador();
}