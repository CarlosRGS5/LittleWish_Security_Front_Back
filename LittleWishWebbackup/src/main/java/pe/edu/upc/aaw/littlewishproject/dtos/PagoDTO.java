package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.Proyectos;
import pe.edu.upc.aaw.littlewishproject.entities.Tarjeta;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class PagoDTO {
    private int idPago;

    private int monto;

    private LocalDate fecha;

    private TarjetaDTO tarjeta;

    private ProyectosDTO proyectos;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TarjetaDTO getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDTO tarjeta) {
        this.tarjeta = tarjeta;
    }

    public ProyectosDTO getProyectos() {
        return proyectos;
    }

    public void setProyectos(ProyectosDTO proyectos) {
        this.proyectos = proyectos;
    }
}
