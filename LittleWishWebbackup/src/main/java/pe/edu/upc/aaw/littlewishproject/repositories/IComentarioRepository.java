package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishproject.entities.Comentario;

import java.util.List;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario, Integer> {

    @Query(value = "select us.id, us.name, sum(co.puntuacion) as sum_puntuaciones,count(co.id_comentario) as nro_puntuaciones,\n"+
            " (sum(co.puntuacion) * 1.00) / (count(co.id_comentario) * 1.00) as prom_puntuaciones\n"+
            " from users us inner join comentario co on us.id = co.user_receptor_id\n"+
            " group by us.id, us.name\n"+
            " order by 5 desc\n",nativeQuery = true)
    public List<String[]> valoracionPorUsuario();

}
