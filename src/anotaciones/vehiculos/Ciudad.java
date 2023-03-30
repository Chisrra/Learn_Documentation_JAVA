package anotaciones.vehiculos;

import java.lang.annotation.*;

/**
 * Esta anotación indica que una clase sea un vehiculo de {@link Vehiculos.Vehiculo} estara diseñada para su uso en ciudad
 *
 * @since 1.0
 * @version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Ciudad {
    /**
     * Velocidad máxima que debera tener el vehículo
     * @return velocidad máxima
     */
    double velocidadMax();

    /**
     * Velocidad recomendada para ciurcular con el vehículo
     * @return velocidad recomendada
     */
    double velocidadRecomendada();
}
