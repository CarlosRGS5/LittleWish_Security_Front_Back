package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.CurriculumVitae;
import pe.edu.upc.aaw.littlewishproject.repositories.ICurriculumVitaeRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ICurriculumVitaeService;

import java.util.List;

@Service
public class CurriculumVitaeServiceImplement implements ICurriculumVitaeService {
    @Autowired
    private ICurriculumVitaeRepository cvR;

    @Override
    public void insert(CurriculumVitae curriculumVitae) {
        cvR.save(curriculumVitae);
    }

    @Override
    public List<CurriculumVitae> list() {
        return cvR.findAll();
    }

    @Override
    public void delete(int ID_CV) {
        cvR.deleteById(ID_CV);
    }
}
