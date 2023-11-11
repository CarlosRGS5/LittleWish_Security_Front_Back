package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Idiomas;
import pe.edu.upc.aaw.littlewishproject.repositories.IIdiomasRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IIdiomasService;

import java.util.List;

@Service
public class IdiomasServiceImplement implements IIdiomasService {
    @Autowired
    private IIdiomasRepository iR;

    @Override
    public void insert(Idiomas idiomas) {
        iR.save(idiomas);
    }

    @Override
    public List<Idiomas> list() {
        return iR.findAll();
    }

    @Override
    public void delete(int ID_Idiomas) {
        iR.deleteById(ID_Idiomas);
    }
}
