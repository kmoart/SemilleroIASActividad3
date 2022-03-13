package co.com.ias.training.ServicioMantenimiento.core.domain;

import org.apache.commons.lang3.Validate;

public class Servicio {

    private final ServicioId id;
    private final ServicioName name;
    private final ServicioDescription description;

    public Servicio(ServicioId id, ServicioName name, ServicioDescription description) {
        this.id = Validate.notNull(id, "Service id can not be null.");
        this.name = Validate.notNull(name, "Service name can not be null.");
        this.description = Validate.notNull(description, "Service description can not be null");
    }

    public ServicioId getId() {
        return id;
    }

    public ServicioName getName() {
        return name;
    }

    public ServicioDescription getDescription() {
        return description;
    }
}


