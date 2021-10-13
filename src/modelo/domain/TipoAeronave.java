package modelo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author rodri
 */
@Entity
public class TipoAeronave implements Serializable {

    @Id
    @GeneratedValue
    private Long idTipoAeronave;

    @Basic
    private String descripcion;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "tipoAeronave")
    private List<Aeronave> aeronaves;// = new ArrayList<Aeronave>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Tripulante> tripulantes;

    public TipoAeronave() {
    }

    public TipoAeronave(//Long idTipoAeronave,
            String descripcion, List<Aeronave> aeronaves, List<Tripulante> tripulantes) {
        //this.idTipoAeronave = idTipoAeronave;
        this.descripcion = descripcion;
        this.aeronaves = aeronaves;
        this.tripulantes = tripulantes;
    }

    public Long getIdTipoAeronave() {
        return idTipoAeronave;
    }

    public void setIdTipoAeronave(Long idTipoAeronave) {
        this.idTipoAeronave = idTipoAeronave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Aeronave> getAeronaves() {
        if (aeronaves == null) {
            aeronaves = new ArrayList<>();
        }
        return aeronaves;
    }

    public void setAeronaves(List<Aeronave> aeronaves) {
        this.aeronaves = aeronaves;
    }

    public void addAeronafe(Aeronave aeronafe) {
        getAeronaves().add(aeronafe);
        aeronafe.setTipoAeronave(this);
    }

    public void removeAeronafe(Aeronave aeronafe) {
        getAeronaves().remove(aeronafe);
        aeronafe.setTipoAeronave(null);
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
    }

    public void removeTripulante(Tripulante tripulante) {
        getTripulantes().remove(tripulante);
    }

    @Override
    public String toString() {
        return "idTipoAeronave=" + idTipoAeronave + ", descripcion=" + descripcion ;
    }
    
    


}
