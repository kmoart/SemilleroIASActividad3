package co.com.ias.training.ServicioMantenimiento.core.gateways;

import co.com.ias.training.ServicioMantenimiento.core.domain.Servicio;
import co.com.ias.training.ServicioMantenimiento.core.domain.ServicioId;
import co.com.ias.training.ServicioMantenimiento.shared.domain.PageQuery;

import java.util.List;
import java.util.Optional;

public interface ServiceMaintenanceRepository {

    //Para consultar una lista de productos se le envía la clase PageQuery
    List<Servicio> query(PageQuery pageQuery);

    //Se agrega el retorno como Optional porque puede que exista o no un servicio de mantenimiento
    Optional<Servicio> get(ServicioId servicioId);

    //Por último se agrega un métodoque guarde el producto
    void store(Servicio servicio);

}
