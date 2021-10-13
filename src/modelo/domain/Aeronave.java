package modelo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author rodri
 */
@Entity
public class Aeronave implements Serializable {

    @Id
    @GeneratedValue
    private Long idAeronave;

    @Basic
    private String fabricante;

    @Basic
    private String modelo;

    @ManyToOne 
    private TipoAeronave tipoAeronave;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "aeronave")
    private List<Vuelo> vueloes;// = new ArrayList<Vuelo>();

    public Aeronave() {
    }

    public Aeronave(//Long idAeronave,
            String fabricante, String modelo, TipoAeronave tipoAeronave, List<Vuelo> vueloes) {
        //this.idAeronave = idAeronave;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipoAeronave = tipoAeronave;
        this.vueloes = vueloes;
    }

    public Long getIdAeronave() {
        return idAeronave;
    }

    public void setIdAeronave(Long idAeronave) {
        this.idAeronave = idAeronave;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoAeronave getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(TipoAeronave tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
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
        vuelo.setAeronave(this);
    }

    public void removeVuelo(Vuelo vuelo) {
        getVueloes().remove(vuelo);
        vuelo.setAeronave(null);
    }


}
