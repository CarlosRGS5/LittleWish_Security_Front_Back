package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Certificaciones;
import pe.edu.upc.aaw.littlewishproject.repositories.ICertificacionesRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ICertificacionesService;

import java.util.List;

@Service
public class CertificacionesServiceImplement implements ICertificacionesService {

    @Autowired
    private ICertificacionesRepository cR;

    @Override
    public void insert(Certificaciones certificaciones) {
        cR.save(certificaciones);
    }

    @Override
    public List<Certificaciones> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int ID_Certificaciones) {
        cR.deleteById(ID_Certificaciones);
    }
}
