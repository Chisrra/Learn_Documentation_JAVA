import java.sql.*;

/**
 * Esta es una clase que se encarga de conectarse a una base de datos utilizando la biblioteca JDBC
 * Para realizar la  conexión se solicita el url, el usuario y la contraseña como datos String
 * Una vez conectado se pueden ejecutar las funciones de consulta y de cerrar la conexión.
 */
public class ConexionBD {
    private Connection conexion;

    /**
     * Crea una nueva instancia de ConexionBD con el URL de la conexión, el nombre del usuario y su contraseña.
     *
     * @param url de la conexión de la base de datos.
     * @param usuario es el nombre utilizado para conectarse a la base de datos.
     * @param password utilizada para conectarse a la base de datos.
     * @throws SQLException si hay un error al intentar conectarse a la base de datos.
     */
    public ConexionBD(String url, String usuario, String password) throws SQLException {
        this.conexion = DriverManager.getConnection(url, usuario, password);
    }

    /**
     * Ejecuta una consulta SQL en la base de datos y devuelve un ResultSet.
     *
     * @param consulta SQL a ejecutar.
     * @return ResulSet que contiene el resultado de la consulta.
     * @throws SQLException si hay un error al ejecutar la consulta.
     */
    public ResultSet ejecutarConsulta(String consulta) throws SQLException {
        Statement statement = conexion.createStatement();
        return statement.executeQuery(consulta);
    }

    /**
     * Ejecuta actualizaciones SQL en la base de datos y devuelve el número de registros afectados.
     *
     * @param actualizacion la query de actualizacion SQL a ejecutar.
     * @return el número de filas afectadas.
     * @throws SQLException si hay un error al intentar ejecutar la actualización.
     */
    public int actualizarRegistros(String actualizacion) throws SQLException {
        Statement statement = conexion.createStatement();
        return statement.executeUpdate(actualizacion);
    }

    /**
     * Cierra la conexion con la base de datos.
     *
     * @throws SQLException si hay un error al intentar cerrar la base de datos.
     */
    public void cerrarConexion() throws SQLException {
        conexion.close();
    }
}
