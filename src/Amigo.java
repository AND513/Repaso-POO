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
public class Amigo extends ContactoCC {
    private String apodo;
    private String cumpleanios;
    private String facebook;
    private String twitter;

    public Amigo(String nombre, int telefono, int celular, String correo, String apodo, String cumpleanios,
            String facebook, String twitter) {
        super(nombre, telefono, celular, correo);
        this.apodo = apodo;
        this.cumpleanios = cumpleanios;
        this.facebook = facebook;
        this.twitter = twitter;
    }

    public String getApodo() {
        return apodo;
    }

    public String getCumpleanios() {
        return cumpleanios;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setCumpleanios(String cumpleanios) {
        this.cumpleanios = cumpleanios;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Override
    public String toString() {
        return super.toString() + "\nApodo: " + apodo + "\nCumpleanios" + cumpleanios + "\nFacebook: " + facebook
                + "\nTwitter" + twitter;
    }
}