package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Tarjeta;
import pe.edu.upc.aaw.littlewishproject.repositories.ITarjetaRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ITarjetaService;

import java.util.List;

@Service
public class TarjetaServiceimplement implements ITarjetaService {
    @Autowired
    private ITarjetaRepository tR;

    @Override
    public void insert(Tarjeta tarjeta) {
        tR.save(tarjeta);
    }

    @Override
    public List<Tarjeta> list() {
        return tR.findAll();
    }
}
