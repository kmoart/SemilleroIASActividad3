package co.com.ias.training.ServicioMantenimiento.shared.domain;

import org.apache.commons.lang3.Validate;

public class PageQuery {

    private final Skip skip;
    private final Limit limit;

    public PageQuery(Skip skip, Limit limit) {
        //Verificamos que no lleguen nulos
        this.skip = Validate.notNull(skip);
        this.limit = Validate.notNull(limit);
    }

    public Skip getSkip() {
        return skip;
    }

    public Limit getLimit() {
        return limit;
    }
}
