/**
 * Clase para definir un Contacto
 *
 * @author Cruz Barrios Luis Alberto, Flores Molina Alfredo, Fernandez Neria
 *         Montserrat, Maya Sanchez Andrea Fernanda, Ortiz Covarrubias Andres
 *         Uriel, Lopez Espindola Luis Enrique
 * @version Septiembre 2020
 */

class Contacto {
    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nTelefono: " + telefono;
    }
}