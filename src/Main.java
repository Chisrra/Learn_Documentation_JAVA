import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Esta clase contiene el método main() que inicia la aplicación.
 * La aplicación se utulizara para llamar a diferentes clases y metodos documentados.
 */
public class Main {
    /**
     * Este método es el que hara las llamadas a las funciones y clases.
     *
     * @param args los argumentos de línea de comando (no se utiliza en esta aplicación).
     */
    public static void main(String[] args) {
        int n = 5;
        //final String URL = "jdbc:mysql://localhost:3306/mydb?useSSL=true";
        final String URL = "jdbc:mysql://localhost:3306/pruebas";
        final String USER ="root";
        final String PASS = "working-BD#1";
        //Probando funcion sum
        System.out.println(sum(20, 10));

        //Probando clase Persona
        Persona persona1 = new Persona("Lalo", 20);
        System.out.println(persona1.saludar());
        System.out.println(persona1.caminar());
        System.out.printf("Edad de %s es %d%n", persona1.getNombre(), persona1.getEdad());
        System.out.printf("El factorial de %d es: %d%n", n, factorial(n));

        //Probando clase ConexionBD
        try {
            ConexionBD conexionBD = new ConexionBD(URL, USER, PASS);
            ResultSet consulta = conexionBD.ejecutarConsulta("SELECT * FROM usuario");

            while (consulta.next()) {
                int id = consulta.getInt("id");
                String nombre = consulta.getString("nombre");
                String email = consulta.getString("email");

                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
            }

            conexionBD.cerrarConexion();

        } catch (SQLException e) {
            System.out.println("Algo salio mal, este es el error:\n" + e);
        }

        //Probando enum y clase Usuario
        Usuario usuario1 = new Usuario("Marquitos", NivelAcceso.INVITADO);
        System.out.printf("Nombre del usuario %s \n", usuario1.getNombre());
        System.out.printf("Nivel de acceso del usuario: %s \n", usuario1.getNivelAcceso());
        usuario1.setNivelAcceso(NivelAcceso.USUARIO_REGISTRADO);
        System.out.printf("El nuevo nivel de usuario es: %s \n", usuario1.getNivelAcceso());


    }

    /**
     * Este método suma dos número enteros y devuelve el resultado.
     *
     * @param a primer número entero.
     * @param b segundo número entero.
     * @return resultado de la suma.
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Función recursiva que calcula el factorial de un número entero.
     * El factorial de un número entero n se define como el producto de todos los números enteros positivos desde 1 hasta n.
     *
     * @param n el número para el cual se calculara el factorial.
     * @return el factorial de n.
     * @throws IllegalArgumentException si n es negativo.
     */
    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("El número debe ser no negativo");
        if (n <= 1)
            return 1;

        return n * factorial(n - 1);
    }
}