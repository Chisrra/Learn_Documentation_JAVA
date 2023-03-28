/**
 * Esta es una clase que define un nuevo usuario dado un nombre y nivel de acceso.
 * La clase tiene nombre del usuario y su nivel de acceso.
 */
public class Usuario {
    private String nombre;
    private NivelAcceso nivelAcceso;

    /**
     * Genera una nueva instancia de Usuario con el nombre y nivel de acceso especificados
     *
     * @param nombre del usuario
     * @param nivelAcceso del usuario
     */
    public Usuario(String nombre, NivelAcceso nivelAcceso) {
        this.nombre = nombre;
        this.nivelAcceso = nivelAcceso;
    }

    /**
     * Regresa el nombre del usuario
     *
     * @return nombre del usuario
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Regresa el nivel de acceso del usuario
     *
     * @return nivel de acceso.
     */
    public NivelAcceso getNivelAcceso() {
        return  this.nivelAcceso;
    }

    /**
     * Actualiza el nivel de acceso del usuario
     *
     * @param nivelAcceso nuevo para el usuario
     */
    public void setNivelAcceso(NivelAcceso nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
