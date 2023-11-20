package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;


import pe.edu.upc.aaw.littlewishproject.entities.Proyectos;

import java.time.LocalDate;
import java.util.List;

public interface IProyectosService {
    public void insert(Proyectos proye);
    public List<Proyectos> list();
    public void delete(int idProyecto);
    public Proyectos listarId(int idProyecto);
    public List<String[]> quantityProyectDesarrollador();
}
