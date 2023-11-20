package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;
import pe.edu.upc.aaw.littlewishproject.entities.Comentario;


import java.util.List;

public interface IComentarioService {

    void insert(Comentario comentario);

    public List<Comentario> list();

    public List<Comentario> listByUser(Long idUser);

    public void delete(int idComentario);

    public List<String[]> valoracionPorUsuario();



}
