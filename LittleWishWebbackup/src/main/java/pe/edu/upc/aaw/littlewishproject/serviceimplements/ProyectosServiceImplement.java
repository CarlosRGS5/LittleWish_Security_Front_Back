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
    public void insert(Proyectos proye) {
        pR.save(proye);
    }

    @Override
    public List<Proyectos> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idProyecto) {
        pR.deleteById(idProyecto);
    }

    @Override
    public Proyectos listarId(int idProyecto) {
        return pR.findById(idProyecto).orElse(new Proyectos());
    }

    @Override
    public List<String[]> quantityProyectDesarrollador() {
        return pR.quantityProyectDesarrollador();
    }


}