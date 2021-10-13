package modelo.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.domain.Asiento;
import modelo.domain.Pasajero;
import modelo.domain.Vuelo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-12T21:34:52")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Pasajero> pasajero;
    public static volatile SingularAttribute<Reserva, Asiento> asiento;
    public static volatile SingularAttribute<Reserva, Vuelo> vuelo;
    public static volatile SingularAttribute<Reserva, Long> idReserva;

}