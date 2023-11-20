package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Pago;

import java.util.List;

public interface IPagoService {
    public void insert(Pago pago);
    public List<Pago> list();
    public void delete(int idPago);
    public Pago listarId(int idpago);

}