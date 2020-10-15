/**
 *  Clase que permite modelar un Amigo a partir de un Contacto
 * @author Cruz Barrios Luis Alberto
 * @author Flores Molina Alfredo
 * @author Fernandez Neria Montserrat
 * @author Maya Sanchez Andrea Fernanda 
 * @author Ortiz Covarrubias Andres Uriel
 * @author Lopez Espindola Luis Enrique
 * @version Octubre 2020
 */
public class Amigo extends ContactoCC {
    private String apodo;
    private String cumpleanios;
    private String facebook;
    private String twitter;

    /**
     * Constructor que recibe parametros
     *
     * @param nombre   El nombre del Amigo
     * @param telefono El telefono casa del Amigo 
     * @param celular  El celular del Amigo
     * @param correo   El correo del Amigo
     * @param apodo   El apodo del Amigo
     * @param cumpleanios El cumpleanios del Amigo
     * @param facebook El facebook del Amigo
     * @param twitter  El twitter del Amigo
     */
    public Amigo(String nombre, int telefono, int celular, String correo, String apodo, String cumpleanios,
            String facebook, String twitter) {
        super(nombre, telefono, celular, correo);
        this.apodo = apodo;
        this.cumpleanios = cumpleanios;
        this.facebook = facebook;
        this.twitter = twitter;
    }
/**
     * Metodo para obtener el apodo del contacto Amigo
     *
     * @return String el apodo del contacto Amigo
     */
    public String getApodo() {
        return apodo;
    }

/**
     * Metodo para obtener el cumpleanios del contacto Amigo
     *
     * @return String el cumpleanios del contacto Amigo
     */
    public String getCumpleanios() {
        return cumpleanios;
    }

/**
     * Metodo para obtener el Facebook del contacto Amigo
     *
     * @return String el Facebook del contacto Amigo
     */
    public String getFacebook() {
        return facebook;
    }

/**
     * Metodo para obtener el Twitter del contacto Amigo
     *
     * @return String el Twitter del contacto Amigo
     */
    public String getTwitter() {
        return twitter;
    }
/**
     * Metodo para establecer el apodo del contacto Amigo
     *
     * @param apodo El apodo del contacto Amigo
     */
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

/**
     * Metodo para establecer el cumpleanios del contacto Amigo
     *
     * @param apodo El cumpleanios del contactoAmigo
     */
    public void setCumpleanios(String cumpleanios) {
        this.cumpleanios = cumpleanios;
    }

/**
     * Metodo para establecer el Facebook del contacto Amigo
     *
     * @param facebook El Facebook del contacto Amigo
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

/**
     * Metodo para establecer el Twitter del contacto Amigo
     *
     * @param twitter El Twitter del contacto Amigo
     */
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
/**
     * Metodo para imprimir un contacto Amigo como una cadena de caracteres
     *
     * @return String El contacto Amigo en formato de cadena de caracter
     */
    @Override
    public String toString() {
        return super.toString() + "\nApodo: " + apodo + "\nCumpleanios" + cumpleanios + "\nFacebook: " + facebook
                + "\nTwitter" + twitter;
    }
}
