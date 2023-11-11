package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Experiencia_Laboral;

import java.util.List;

public interface IExperiencia_LaboralService {
    public void insert(Experiencia_Laboral experiencia_laboral);
    public List<Experiencia_Laboral> list();
    public void delete(int ID_Experiencia_Laboral);
}
