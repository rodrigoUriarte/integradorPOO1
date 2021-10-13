package modelo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 * @author rodri
 */
@Entity
public class Vuelo implements Serializable {

    @Id
    @GeneratedValue
    private Long idVuelo;

    @Basic
    private String origen;

    @Basic
    private String destino;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaSalida;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaArribo;

    @Basic
    private int distancia;

    @ManyToOne
    private Aeronave aeronave;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "vuelo")
    private List<Reserva> reservas;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Tripulante> tripulantes;

    public Vuelo() {
    }

    public Vuelo(String origen, String destino, Date fechaSalida, Date fechaArribo, int distancia, Aeronave aeronave, List<Reserva> reservas, List<Tripulante> tripulantes) {
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaArribo = fechaArribo;
        this.distancia = distancia;
        this.aeronave = aeronave;
        this.reservas = reservas;
        this.tripulantes = tripulantes;
    }

    public Long getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Long idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaArribo() {
        return fechaArribo;
    }

    public void setFechaArribo(Date fechaArribo) {
        this.fechaArribo = fechaArribo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
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
        reserva.setVuelo(this);
    }

    public void removeReserva(Reserva reserva) {
        getReservas().remove(reserva);
        reserva.setVuelo(null);
    }

    public List<Tripulante> getTripulantes() {
        if (tripulantes == null) {
            tripulantes = new ArrayList<>();
        }
        return tripulantes;
    }

    public void setTripulantes(List<Tripulante> tripulantes) {
        this.tripulantes = tripulantes;
    }

    public void addTripulante(Tripulante tripulante) {
        getTripulantes().add(tripulante);
        tripulante.getVueloes().add(this);
    }

    public void removeTripulante(Tripulante tripulante) {
        //getTripulantes().remove(tripulante);
        tripulante.getVueloes().remove(this);
    }

    @Override
    public String toString() {
        return "idVuelo=" + idVuelo + ", origen=" + origen + ", destino=" + destino;
    }
    
    

    

}
