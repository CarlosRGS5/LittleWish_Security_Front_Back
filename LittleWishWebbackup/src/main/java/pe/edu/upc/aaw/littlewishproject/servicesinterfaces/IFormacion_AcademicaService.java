package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.FormacionAcademica;
import pe.edu.upc.aaw.littlewishproject.entities.Universidades;

import java.util.List;

public interface IFormacion_AcademicaService {
    public void insert(FormacionAcademica formacion_academica);
    public List<FormacionAcademica> list();
    public void delete(int ID_Formacion_Academica);
    public FormacionAcademica listarId(int ID_Formacion_Academica);
}
