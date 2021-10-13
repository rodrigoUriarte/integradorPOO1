package modelo.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.domain.Aeronave;
import modelo.domain.Tripulante;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-12T21:34:52")
@StaticMetamodel(TipoAeronave.class)
public class TipoAeronave_ { 

    public static volatile SingularAttribute<TipoAeronave, String> descripcion;
    public static volatile ListAttribute<TipoAeronave, Tripulante> tripulantes;
    public static volatile ListAttribute<TipoAeronave, Aeronave> aeronaves;
    public static volatile SingularAttribute<TipoAeronave, Long> idTipoAeronave;

}