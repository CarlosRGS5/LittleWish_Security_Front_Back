package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Favoritos;
import pe.edu.upc.aaw.littlewishproject.repositories.IFavoritosRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IFavoritosService;

import java.util.List;

@Service
public class FavoritosServiceImplement implements IFavoritosService {

    @Autowired
    private IFavoritosRepository fR;

    @Override
    public void insert(Favoritos favoritos) {
        fR.save(favoritos);
    }

    @Override
    public List<Favoritos> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int idUniversity){
        fR.deleteById(idUniversity);
    }
}
