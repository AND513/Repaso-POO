/**
 * Clase para definir un Contacto
 * @author Cruz Barrios Luis Alberto
 * @author Flores Molina Alfredo
 * @author Fernandez Neria Montserrat
 * @author Maya Sanchez Andrea Fernanda 
 * @author Ortiz Covarrubias Andres Uriel
 * @author Lopez Espindola Luis Enrique
 * @version
 */
public class Contacto {
    private String nombre;
    private int telefono;

     /**
   * Constructor que recibe parámetros
   * @param nombre El nombre del Contacto
   * @param telefono El telefono casa del Contacto
      */
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
   * Método para obtener el nombre del Contacto
   * @return String El nombre del Contacto
   */
    public String getNombre() {
        return nombre;
    }
    
    /**
   * Método para obtener el telefono casa del Contacto
   * @return int El telefono del Contacto
   */
    public int getTelefono() {
        return telefono;
    }
/**
   * Método para establecer el nombre del Contacto
   * @param nombre El nombre del Contato
   */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
   * Método para establecer el telefono casa del Contacto
   * @param telefono El telefono del Contacto
   */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
   * Método para imprimir un Contacto como una cadena de caracteres
   * @return String El Contacto en formato de cadena de caracter
   */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nTelefono: " + telefono;
    }
}
