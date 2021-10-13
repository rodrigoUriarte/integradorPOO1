package modelo.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.domain.Comida;
import modelo.domain.Reserva;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-12T21:34:52")
@StaticMetamodel(Pasajero.class)
public class Pasajero_ extends Persona_ {

    public static volatile SingularAttribute<Pasajero, Boolean> viajeroFrecuente;
    public static volatile ListAttribute<Pasajero, Reserva> reservas;
    public static volatile SingularAttribute<Pasajero, Long> idPasajero;
    public static volatile SingularAttribute<Pasajero, Comida> comida;

}