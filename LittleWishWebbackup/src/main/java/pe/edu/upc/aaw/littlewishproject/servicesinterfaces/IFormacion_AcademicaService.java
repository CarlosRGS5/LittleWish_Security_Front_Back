package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.FormacionAcademica;

import java.util.List;

public interface IFormacion_AcademicaService {
    public void insert(FormacionAcademica formacion_academica);
    public List<FormacionAcademica> list();
    public void delete(int ID_Formacion_Academica);
}
