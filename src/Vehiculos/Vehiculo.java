package Vehiculos;

/**
 * La interfaz proporciona los metodos que los vehiculo deveria tener.
 * Permitira arrancar, acelerar y frenar
 */
public interface Vehiculo {
    /**
     * Este metodo se encargara de poner en marcha el vehiculo
     */
    void arrancar();

    /**
     * Este metodo se encargara de incrementar la velocidad
     */
    void acelerar();

    /**
     * Este metodo detendra la velocidad del vehiculo
     */
    void frenar();
}
