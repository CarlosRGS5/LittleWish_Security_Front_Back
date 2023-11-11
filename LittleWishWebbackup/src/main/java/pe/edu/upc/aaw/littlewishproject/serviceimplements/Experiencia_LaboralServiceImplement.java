package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Experiencia_Laboral;
import pe.edu.upc.aaw.littlewishproject.repositories.IExperiencia_LaboralRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IExperiencia_LaboralService;

import java.util.List;

@Service
public class Experiencia_LaboralServiceImplement implements IExperiencia_LaboralService {
    @Autowired
    private IExperiencia_LaboralRepository elR;

    @Override
    public void insert(Experiencia_Laboral experiencia_laboral) {
        elR.save(experiencia_laboral);
    }

    @Override
    public List<Experiencia_Laboral> list() {
        return elR.findAll();
    }

    @Override
    public void delete(int ID_Experiencia_Laboral) {
        elR.deleteById(ID_Experiencia_Laboral);
    }
}
