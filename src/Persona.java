/**
 * Esta es una clase basica que representa a una persona
 * La persona tiene nombre y edad; puede saludar y caminar
 */
public class Persona {
    private final String nombre;
    private final int edad;

    /**
     * Crea una nueva instancia de Persona con el nombre y la edad especificados.
     *
     * @param nombre el nombre de la persona
     * @param edad la edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Saluda a la persona
     *
     * @return el saludo
     */
    public String saludar() {
        return String.format("Hola %s, ¿Qué tal estas hoy?", this.nombre);
    }

    /**
     * Hace que la persona camine
     *
     * @return mensaje de la persona caminando
     */
    public String caminar() {
        return String.format("Persona %s está caminando", this.nombre);
    }

    /**
     * Devuelve el nombre de la persona
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve la edad de la persona
     *
     * @return edad de la persona
     */
    public int getEdad() {
        return this.edad;
    }
}
