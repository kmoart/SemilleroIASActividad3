package co.com.ias.training.ServicioMantenimiento.infrastructure.controller.models;

public class ServicioInput {

    private String name;
    private String description;

    public ServicioInput(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ServicioInput() {
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
