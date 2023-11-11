package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;


import pe.edu.upc.aaw.littlewishproject.entities.Proyectos;

import java.util.List;

public interface IProyectosService {
    public void insert(Proyectos proyectos);
    public List<Proyectos> list();
    Proyectos buscarProyecto(String descripcion);
}
