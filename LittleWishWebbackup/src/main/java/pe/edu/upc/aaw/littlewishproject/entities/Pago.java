package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column(name = "monto",nullable = false)
    private int monto;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "idtarjeta",nullable = false)
    private Tarjeta tarjeta;
    @ManyToOne
    @JoinColumn(name = "ID_Proyecto",nullable = false)
    private Proyectos proyectos;

    public Pago(){
    }

    public Pago(int idPago, int monto, LocalDate fecha, Tarjeta tarjeta, Proyectos proyectos) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.tarjeta = tarjeta;
        this.proyectos = proyectos;
    }

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

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Proyectos getProyectos() {
        return proyectos;
    }

    public void setProyectos(Proyectos proyectos) {
        this.proyectos = proyectos;
    }
}
