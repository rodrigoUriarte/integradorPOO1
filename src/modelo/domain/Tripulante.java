package modelo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author rodri
 */
@Entity
public class Tripulante extends Persona implements Serializable {

    @Id
    @GeneratedValue
    private Long idTripulante;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},
            mappedBy = "tripulantes")
    private List<TipoAeronave> tipoAeronaves;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},
            mappedBy = "tripulantes")
    private List<Vuelo> vueloes;

    public Tripulante() {
    }

    public Tripulante(String nombre, String apellido, String telefono, String email, Date fnac, List<TipoAeronave> tipoAeronaves, List<Vuelo> vueloes) {
        super(nombre, apellido, telefono, email, fnac);
        this.tipoAeronaves = tipoAeronaves;
        this.vueloes = vueloes;
    }

    public Long getIdTripulante() {
        return idTripulante;
    }

    public void setIdTripulante(Long idTripulante) {
        this.idTripulante = idTripulante;
    }

    public List<TipoAeronave> getTipoAeronaves() {
        if (tipoAeronaves == null) {
            tipoAeronaves = new ArrayList<>();
        }
        return tipoAeronaves;
    }

    public void setTipoAeronaves(List<TipoAeronave> tipoAeronaves) {
        this.tipoAeronaves = tipoAeronaves;
    }

    public void addTipoAeronafe(TipoAeronave tipoAeronafe) {
        getTipoAeronaves().add(tipoAeronafe);
        tipoAeronafe.getTripulantes().add(this);
    }

    public void removeTipoAeronafe(TipoAeronave tipoAeronafe) {
        getTipoAeronaves().remove(tipoAeronafe);
        tipoAeronafe.getTripulantes().remove(this);
    }

    public List<Vuelo> getVueloes() {
        if (vueloes == null) {
            vueloes = new ArrayList<>();
        }
        return vueloes;
    }

    public void setVueloes(List<Vuelo> vueloes) {
        this.vueloes = vueloes;
    }

    public void addVuelo(Vuelo vuelo) {
        getVueloes().add(vuelo);
    }

    public void removeVuelo(Vuelo vuelo) {
        getVueloes().remove(vuelo);
    }

}
