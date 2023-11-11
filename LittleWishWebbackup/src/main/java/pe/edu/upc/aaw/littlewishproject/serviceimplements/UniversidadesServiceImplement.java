package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Universidades;
import pe.edu.upc.aaw.littlewishproject.repositories.IUniversidadesRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IUniversidadesService;

import java.util.List;

@Service
public class UniversidadesServiceImplement implements IUniversidadesService {
    @Autowired
    private IUniversidadesRepository uR;

    @Override
    public void insert(Universidades universidades) {
        uR.save(universidades);
    }

    @Override
    public List<Universidades> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int ID_Universidades) {
        uR.deleteById(ID_Universidades);
    }
}
