package co.com.ias.training.ServicioMantenimiento.core.domain;

import org.apache.commons.lang3.Validate;

public class ServicioId {

    private final String value;

    public ServicioId(String value) {
        Validate.notNull(value, "Service id can not be blank");
        //trim elimina los espacios a lado y lado
        Validate.isTrue(value.trim().length() == 36, "Product id can not different than 36 characters" );
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ServicioId{" +
                "value='" + value + '\'' +
                '}';
    }
}
