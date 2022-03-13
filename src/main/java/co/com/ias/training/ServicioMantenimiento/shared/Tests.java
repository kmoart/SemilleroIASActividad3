package co.com.ias.training.ServicioMantenimiento.shared;

import co.com.ias.training.ServicioMantenimiento.core.domain.Servicio;
import co.com.ias.training.ServicioMantenimiento.core.domain.ServicioDescription;
import co.com.ias.training.ServicioMantenimiento.core.domain.ServicioId;
import co.com.ias.training.ServicioMantenimiento.core.domain.ServicioName;

public class Tests {

    public static void main(String[] args){
        ServicioId productId = new ServicioId(" 1   ");

        new Servicio(productId, new ServicioName("Producto 1"), new ServicioDescription("Descripción del servicio 1"));
    }
}
