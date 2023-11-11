package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Formacion_Academica;

import java.util.List;

public interface IFormacion_AcademicaService {
    public void insert(Formacion_Academica formacion_academica);
    public List<Formacion_Academica> list();
    public void delete(int ID_Formacion_Academica);
}
