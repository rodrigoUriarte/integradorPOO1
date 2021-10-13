package modelo.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.domain.Aeronave;
import modelo.domain.Reserva;
import modelo.domain.Tripulante;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-12T21:34:52")
@StaticMetamodel(Vuelo.class)
public class Vuelo_ { 

    public static volatile ListAttribute<Vuelo, Tripulante> tripulantes;
    public static volatile ListAttribute<Vuelo, Reserva> reservas;
    public static volatile SingularAttribute<Vuelo, Date> fechaSalida;
    public static volatile SingularAttribute<Vuelo, Integer> distancia;
    public static volatile SingularAttribute<Vuelo, Long> idVuelo;
    public static volatile SingularAttribute<Vuelo, String> origen;
    public static volatile SingularAttribute<Vuelo, String> destino;
    public static volatile SingularAttribute<Vuelo, Aeronave> aeronave;
    public static volatile SingularAttribute<Vuelo, Date> fechaArribo;

}