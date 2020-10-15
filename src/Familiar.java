/**
 * Clase
 * @author Cruz Barrios Luis Alberto
 * @author Flores Molina Alfredo
 * @author Fernandez Neria Montserrat
 * @author Maya Sanchez Andrea Fernanda 
 * @author Ortiz Covarrubias Andres Uriel
 * @author Lopez Espindola Luis Enrique
 * @version
 */
public class Familiar extends Contacto {
    private String parentesco;
    private String cumpleanios;

    public Familiar(String nombre, int telefono, String parentesco, String cumpleanios) {
        super(nombre, telefono);
        this.parentesco = parentesco;
        this.cumpleanios = cumpleanios;
    }

    public String getParentesco() {
        return parentesco;
    }

    public String getCumpleanios() {
        return cumpleanios;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void setCumpleanios(String cumpleanios) {
        this.cumpleanios = cumpleanios;
    }

    @Override
    public String toString() {
        return super.toString() + "\nParentesco: " + parentesco + "Cumpleanios: " + cumpleanios;
    }
}
