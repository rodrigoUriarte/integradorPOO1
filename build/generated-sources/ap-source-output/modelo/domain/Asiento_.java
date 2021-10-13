package modelo.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.domain.Aeronave;
import modelo.domain.Reserva;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-12T21:34:52")
@StaticMetamodel(Asiento.class)
public class Asiento_ { 

    public static volatile SingularAttribute<Asiento, Long> idAsiento;
    public static volatile SingularAttribute<Asiento, String> columna;
    public static volatile SingularAttribute<Asiento, Integer> precio;
    public static volatile SingularAttribute<Asiento, String> fila;
    public static volatile SingularAttribute<Asiento, Reserva> reserva;
    public static volatile SingularAttribute<Asiento, Aeronave> aeronave;

}