package co.com.ias.training.ServicioMantenimiento.infrastructure.controller;

import co.com.ias.training.ServicioMantenimiento.core.gateways.ServiceMaintenanceRepository;
import co.com.ias.training.ServicioMantenimiento.infrastructure.controller.models.ServicioDTO;
import co.com.ias.training.ServicioMantenimiento.infrastructure.controller.models.ServicioInput;
import co.com.ias.training.ServicioMantenimiento.core.domain.Servicio;
import co.com.ias.training.ServicioMantenimiento.core.domain.ServicioDescription;
import co.com.ias.training.ServicioMantenimiento.core.domain.ServicioId;
import co.com.ias.training.ServicioMantenimiento.core.domain.ServicioName;
import co.com.ias.training.ServicioMantenimiento.shared.domain.Limit;
import co.com.ias.training.ServicioMantenimiento.shared.domain.PageQuery;
import co.com.ias.training.ServicioMantenimiento.shared.domain.Skip;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ServicioController {

    private final ServiceMaintenanceRepository serviceMaintenanceRepository;

    public ServicioController(ServiceMaintenanceRepository serviceMaintenanceRepository) {
        this.serviceMaintenanceRepository = serviceMaintenanceRepository;
    }

    @RequestMapping(value = "/services", method = RequestMethod.POST)
    public ServicioDTO createService(
            //@RequestHeader("Authorization") String authorizationToken,
            @RequestBody ServicioInput servicioInput) {

        Servicio servicio = new Servicio(
                new ServicioId(UUID.randomUUID().toString()),
                new ServicioName(servicioInput.getName()),
                new ServicioDescription(servicioInput.getDescription())
        );

        return ServicioDTO.fromDomain(servicio);
    }

    @RequestMapping(value = "/services/{id}", method = RequestMethod.GET)
    public ServicioDTO getServicio(
            @PathVariable("id") String servicioId
    ) {
        // Representa una fecha local, representa fecha y hora
        //java.time.LocalDateTime
        return new ServicioDTO(
                servicioId,
                "fake",
                "fake"
        );
    }

    //Metodo para listar los servicios de mantenimiento de manera paginada
    @RequestMapping(value = "/services", method = RequestMethod.GET)
    public List<ServicioDTO> listServices(
            @RequestParam(name = "skip", defaultValue = "0") Integer skip,
            @RequestParam(name = "limit", defaultValue = "50") Integer limit
    ) {
        PageQuery pageQuery = new PageQuery(
                new Skip(skip),
                new Limit(limit)
        );
        List<Servicio> servicios = serviceMaintenanceRepository.query(pageQuery);
        List<ServicioDTO> result = new ArrayList<>();

        for (Servicio servicio : servicios) {
            result.add(ServicioDTO.fromDomain(servicio));
        }
        return result;
    }
}
