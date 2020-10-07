/**
 * Clase para definir un Contacto
 *
 * @author Cruz Barrios Luis Alberto, Flores Molina Alfredo, Fernandez Neria
 *         Montserrat, Maya Sanchez Andrea Fernanda, Ortiz Covarrubias Andres
 *         Uriel, Lopez Espindola Luis Enrique
 * @version Septiembre 2020
 */
public class ContactoCC extends Contacto {
    private int celular;
    private String correo;

    public ContactoCC(String nombre, int telefono, int celular, String correo) {
        super(nombre, telefono);
        this.celular = celular;
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return super.toString() + "Celular: " + celular + "\nCorreo: " + correo;
    }
}
