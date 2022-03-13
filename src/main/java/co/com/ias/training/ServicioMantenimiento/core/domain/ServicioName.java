package co.com.ias.training.ServicioMantenimiento.core.domain;

import org.apache.commons.lang3.Validate;

public class ServicioName {

    private final String value;

    public ServicioName(String value) {
        Validate.notNull(value,"Product name can not be null");
        //trim elimina los espacios a lado y lado
        Validate.isTrue(value.trim().length() < 512, "Product name can not be longer than 512" );
        this.value = value;
    }
}
