package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.dtos.UniversidadesCarrerasDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Carreras;
import pe.edu.upc.aaw.littlewishproject.entities.Universidades;

import java.util.List;

public interface IUniversidadesService {
    public void insert(Universidades universidades);
    public List<Universidades> list();
    public void delete(int ID_Universidades);

    public Universidades listarId(int ID_Universidades);
    Long contarUniversidades();
}
