package co.com.ias.training.ServicioMantenimiento.infrastructure.controller.models;

import co.com.ias.training.ServicioMantenimiento.core.domain.Servicio;

public class ServicioDTO {

    private String id;
    private String name;
    private String description;

    public ServicioDTO(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ServicioDTO() {
    }

    //Método desde el dominio
    public static ServicioDTO fromDomain(Servicio product){
        return new ServicioDTO(
                product.getId().toString(),
                product.getName().toString(),
                product.getDescription().toString()
        );
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
