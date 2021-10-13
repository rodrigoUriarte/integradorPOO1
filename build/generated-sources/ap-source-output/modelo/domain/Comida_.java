package modelo.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.domain.Pasajero;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-12T21:34:52")
@StaticMetamodel(Comida.class)
public class Comida_ { 

    public static volatile SingularAttribute<Comida, String> descripcion;
    public static volatile SingularAttribute<Comida, Pasajero> pasajeroes;
    public static volatile SingularAttribute<Comida, Long> idComida;

}