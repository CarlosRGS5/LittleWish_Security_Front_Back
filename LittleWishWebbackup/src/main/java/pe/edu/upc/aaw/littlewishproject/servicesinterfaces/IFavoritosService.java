package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Favoritos;

import java.util.List;

public interface IFavoritosService {

    void insert(Favoritos favoritos);

    public List<Favoritos> list();

    public void delete(int idFavoritos);

}
