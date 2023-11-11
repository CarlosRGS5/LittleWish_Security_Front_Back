package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Pago;
import pe.edu.upc.aaw.littlewishproject.repositories.IPagoRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IPagoService;

import java.util.List;

@Service
public class PagoServiceImplement  implements IPagoService {
    @Autowired
    private IPagoRepository pR;
    @Override
    public void insert(Pago pago) {
        pR.save(pago);
    }

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }
}
