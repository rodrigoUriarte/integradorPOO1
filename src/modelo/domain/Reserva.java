package modelo.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author rodri
 */
@Entity
public class Reserva implements Serializable {

    @Id
    @GeneratedValue
    private Long idReserva;

    @Basic
    private String fila;

    @Basic
    private String columna;

    @Basic
    private int precio;

    @ManyToOne
    private Vuelo vuelo;

    @ManyToOne
    private Pasajero pasajero;

    public Reserva() {
    }

    public Reserva(String fila, String columna, int precio, Vuelo vuelo, Pasajero pasajero) {
        this.fila = fila;
        this.columna = columna;
        this.precio = precio;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", fila=" + fila + ", columna=" + columna + ", precio=" + precio + ", vuelo=" + vuelo + ", pasajero=" + pasajero + '}';
    }

}
