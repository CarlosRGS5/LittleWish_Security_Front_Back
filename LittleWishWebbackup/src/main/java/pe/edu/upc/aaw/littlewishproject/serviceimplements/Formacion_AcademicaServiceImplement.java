package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.FormacionAcademica;
import pe.edu.upc.aaw.littlewishproject.repositories.IFormacion_AcademicaRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IFormacion_AcademicaService;

import java.util.List;

@Service
public class Formacion_AcademicaServiceImplement implements IFormacion_AcademicaService {
    @Autowired
    private IFormacion_AcademicaRepository faR;

    @Override
    public void insert(FormacionAcademica formacion_academica) {
        faR.save(formacion_academica);
    }

    @Override
    public List<FormacionAcademica> list() {
        return faR.findAll();
    }

    @Override
    public void delete(int ID_Formacion_Academica) {
        faR.deleteById(ID_Formacion_Academica);
    }
    @Override
    public FormacionAcademica listarId(int ID_Formacion_Academica) {
        return faR.findById(ID_Formacion_Academica).orElse(new FormacionAcademica());
    }
}
