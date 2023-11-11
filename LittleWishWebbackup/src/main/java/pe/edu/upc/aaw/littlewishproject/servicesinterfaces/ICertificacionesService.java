package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Certificaciones;

import java.util.List;

public interface ICertificacionesService {
    public  void insert(Certificaciones certifications);
    public List<Certificaciones> list();
    public void delete(int ID_Certificaciones);
}
