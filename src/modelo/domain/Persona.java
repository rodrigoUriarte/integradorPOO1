package modelo.domain;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;

/**
 * @author rodri
 */
@MappedSuperclass
public class Persona {

    @Basic
    private String nombre;

    @Basic
    private String apellido;

    @Basic
    private String telefono;

    @Basic
    private String email;
    
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fnac;

    public Persona(String nombre, String apellido, String telefono, String email, Date fnac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fnac = fnac;
    }
    public Persona(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFnac() {
        return fnac;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }

}