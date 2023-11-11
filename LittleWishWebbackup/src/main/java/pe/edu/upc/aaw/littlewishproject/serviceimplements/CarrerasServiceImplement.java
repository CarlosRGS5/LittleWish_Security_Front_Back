package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Carreras;
import pe.edu.upc.aaw.littlewishproject.repositories.ICarrerasRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ICarrerasService;

import java.util.List;

@Service
public class CarrerasServiceImplement implements ICarrerasService {
    @Autowired
    private ICarrerasRepository cR;

    @Override
    public void insert(Carreras carreras) {
        cR.save(carreras);
    }

    @Override
    public List<Carreras> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int ID_Carreras) {
        cR.deleteById(ID_Carreras);
    }
}
