package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Puntuacion;

import java.util.List;

public interface IPuntuacionService {
    void insert(Puntuacion puntuacion);

    public List<Puntuacion> list();

    public void delete(int idUniversity);

}
