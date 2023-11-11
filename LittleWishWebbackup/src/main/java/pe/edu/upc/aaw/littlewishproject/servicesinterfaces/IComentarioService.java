package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;
import pe.edu.upc.aaw.littlewishproject.entities.Comentario;


import java.util.List;

public interface IComentarioService {

    void insert(Comentario comentario);

    public List<Comentario> list();

    public void delete(int idComentario);

}
