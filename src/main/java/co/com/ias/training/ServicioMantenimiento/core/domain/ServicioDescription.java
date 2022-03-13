package co.com.ias.training.ServicioMantenimiento.core.domain;

import org.apache.commons.lang3.Validate;

public class ServicioDescription {
    private final String value;

    public ServicioDescription(String value) {
        Validate.notNull(value,"Product description can not be null");
        //trim elimina los espacios a lado y lado
        Validate.isTrue(value.trim().length() < 512, "Product description can not be longer than 512" );
        this.value = value;
    }
}
