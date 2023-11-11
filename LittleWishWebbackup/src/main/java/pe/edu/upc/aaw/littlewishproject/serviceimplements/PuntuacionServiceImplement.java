package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Puntuacion;
import pe.edu.upc.aaw.littlewishproject.repositories.IPuntuacionRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IPuntuacionService;

import java.util.List;


@Service
public class PuntuacionServiceImplement implements IPuntuacionService {

    @Autowired
    private IPuntuacionRepository pR;

    @Override
    public void insert(Puntuacion puntuacion) {
        pR.save(puntuacion);
    }

    @Override
    public List<Puntuacion> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idUniversity){
        pR.deleteById(idUniversity);
    }


}
