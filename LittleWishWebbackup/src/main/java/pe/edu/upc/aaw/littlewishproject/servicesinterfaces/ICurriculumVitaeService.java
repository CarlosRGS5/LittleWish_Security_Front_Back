package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.CurriculumVitae;
import pe.edu.upc.aaw.littlewishproject.entities.Universidades;

import java.util.List;

public interface ICurriculumVitaeService {
    public void insert(CurriculumVitae curriculumvitae);
    public List<CurriculumVitae> list();
    public void delete(int ID_CV);
    public CurriculumVitae listarId(int ID_CV);
}
