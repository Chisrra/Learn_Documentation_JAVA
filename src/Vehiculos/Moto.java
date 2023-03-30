package Vehiculos;

/**
 * Esta clase tiene simula de forma muy general las principales funciones y usos de una motocicleta
 */
public class Moto implements Vehiculo {
    private int velocidad;
    private final int aceleracion;
    private String modelo;

    /**
     * Genera una nueva instancia de Vehiculos.Moto con el modelo de la moto como principal parametro.
     * @param modelo de la motocicleta.
     */
    public Moto(String modelo) {
        this.modelo = modelo;
        this.velocidad = 0;
        this.aceleracion = 2;
    }

    /**
     * Este metodo nos indicara que la moto ha sido encendido
     */
    @Override
    public void arrancar() {
        System.out.println("La moto ha arrrancado");
    }

    /**
     * Este metodo incrementara la velocidad de la moto
     */
    @Override
    public void acelerar() {
        this.velocidad += this.aceleracion;
        System.out.println("La moto ha acelerado");
    }

    /**
     * Este metodo disminuira la velocidad de la moto hasta 0
     */
    @Override
    public void frenar() {
        this.velocidad = 0;
        System.out.println("La moto ha frenado");
    }

    /**
     * Nos permite obtener el modelo de la moto.
     *
     * @return modelo de la moto
     */
    public String getModelo() {
        return this.modelo;
    }

    /**
     * Nos permiye obtener la velocidad actual de la moto.
     *
     * @return velocidad actual de la moto.
     */
    public int getVelocidad() {
        return this.velocidad;
    }
}
