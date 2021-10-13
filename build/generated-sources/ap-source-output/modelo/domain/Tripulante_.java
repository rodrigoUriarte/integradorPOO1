package modelo.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.domain.TipoAeronave;
import modelo.domain.Vuelo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-12T21:34:52")
@StaticMetamodel(Tripulante.class)
public class Tripulante_ extends Persona_ {

    public static volatile SingularAttribute<Tripulante, Long> idTripulante;
    public static volatile ListAttribute<Tripulante, TipoAeronave> tipoAeronaves;
    public static volatile ListAttribute<Tripulante, Vuelo> vueloes;

}