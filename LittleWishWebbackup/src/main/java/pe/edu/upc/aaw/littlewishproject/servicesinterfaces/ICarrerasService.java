package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Carreras;

import java.util.List;

public interface ICarrerasService {
    public void insert(Carreras carreras);
    public List<Carreras> list();
    public void delete(int ID_Carreras);
}
