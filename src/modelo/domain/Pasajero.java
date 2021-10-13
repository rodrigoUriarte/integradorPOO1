package modelo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author rodri
 */
@Entity
public class Pasajero extends Persona implements Serializable {

    @Id
    @GeneratedValue
    private Long idPasajero;

    @Basic
    private boolean viajeroFrecuente;

    @Basic
    private String comida;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "pasajero")
    private List<Reserva> reservas;

    public Pasajero() {
    }

    public Pasajero(boolean viajeroFrecuente, String comida, String nombre, String apellido, String telefono, String email, Date fnac) {
        super(nombre, apellido, telefono, email, fnac);
        this.viajeroFrecuente = viajeroFrecuente;
        this.comida = comida;
    }

    public Long getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Long idPasajero) {
        this.idPasajero = idPasajero;
    }

    public boolean isViajeroFrecuente() {
        return viajeroFrecuente;
    }

    public void setViajeroFrecuente(boolean viajeroFrecuente) {
        this.viajeroFrecuente = viajeroFrecuente;
    }
    

    public List<Reserva> getReservas() {
        if (reservas == null) {
            reservas = new ArrayList<>();
        }
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void addReserva(Reserva reserva) {
        getReservas().add(reserva);
        reserva.setPasajero(this);
    }

    public void removeReserva(Reserva reserva) {
        getReservas().remove(reserva);
        reserva.setPasajero(null);
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
    
    

}
