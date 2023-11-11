package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishproject.entities.Proyectos;

@Repository
public interface IProyectosRepository extends JpaRepository<Proyectos, Integer> {
    @Query(value = "select * from Proyecto p where p.descripcion like '%descripcion%'",nativeQuery = true)
    Proyectos buscarProyecto(@Param("descripcion") String descripcion);
}
