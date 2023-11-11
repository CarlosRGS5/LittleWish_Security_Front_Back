package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Proyectos;
import pe.edu.upc.aaw.littlewishproject.repositories.IProyectosRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IProyectosService;

import java.util.List;

@Service
public class ProyectosServiceImplement implements IProyectosService {
    @Autowired
    private IProyectosRepository pR;

    @Override
    public void insert(Proyectos proyectos) {
        pR.save(proyectos);
    }

    @Override
    public List<Proyectos> list() {
        return pR.findAll();
    }

    @Override
    public Proyectos buscarProyecto(String descripcion) {
        return pR.buscarProyecto(descripcion);
    }
}
