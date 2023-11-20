package pe.edu.upc.aaw.littlewishproject.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Comentario;
import pe.edu.upc.aaw.littlewishproject.repositories.IComentarioRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComentarioServiceImplement implements IComentarioService {
    @Autowired
    private IComentarioRepository cR;

    @Override
    public void insert(Comentario comentario){
        cR.save(comentario);
    }
    @Override
    public List<Comentario> list(){
        return cR.findAll();
    }

    @Override
    public List<Comentario> listByUser(Long idUser){
        return cR.findAll().stream().filter(comentario -> comentario.getUsersR().getId() == idUser).collect(Collectors.toList());
        //return cR.findAll();
    }

    @Override
    public void delete(int idUniversity){
        cR.deleteById(idUniversity);
    }

    @Override
    public List<String[]> valoracionPorUsuario() {
        return cR.valoracionPorUsuario();
    }



}
