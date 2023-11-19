package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Carreras;
import pe.edu.upc.aaw.littlewishproject.entities.Tarjeta;

import java.util.List;

public interface ITarjetaService {
    public void insert(Tarjeta tarjeta);
    public List<Tarjeta> list();
    public Tarjeta listarId(int idTarjeta);
    public void delete(int idTarjeta);
}
