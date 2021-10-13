package modelo.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.domain.Asiento;
import modelo.domain.TipoAeronave;
import modelo.domain.Vuelo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-12T21:34:52")
@StaticMetamodel(Aeronave.class)
public class Aeronave_ { 

    public static volatile SingularAttribute<Aeronave, TipoAeronave> tipoAeronave;
    public static volatile ListAttribute<Aeronave, Asiento> asientoes;
    public static volatile SingularAttribute<Aeronave, Long> idAeronave;
    public static volatile SingularAttribute<Aeronave, String> fabricante;
    public static volatile SingularAttribute<Aeronave, String> modelo;
    public static volatile ListAttribute<Aeronave, Vuelo> vueloes;

}