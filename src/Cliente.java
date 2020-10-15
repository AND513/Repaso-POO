/**
 * Clase para modelar un contacto Cliente a partir de otra clase
 * @author Cruz Barrios Luis Alberto
 * @author Flores Molina Alfredo
 * @author Fernandez Neria Montserrat
 * @author Maya Sanchez Andrea Fernanda 
 * @author Ortiz Covarrubias Andres Uriel
 * @author Lopez Espindola Luis Enrique
 * @version
 */
public class Cliente extends ContactoCC {
    private String compania;
    private int extension;
    private String webpage;
/**
     * Constructor que recibe parametros
     *
     * @param nombre El nombre del Cliente
     * @param telefono El telefono casa del Cliente
     * @param celular El celular del Cliente
     * @param correo El correo del Cliente
     * @param compania La compania del Cliente
     * @param extension La extension del Cliente
     * @param webpage La pagina web del Cliente
     */
    public Cliente(String nombre, int telefono, int celular, String correo, String compania, int extension,
            String webpage) {
        super(nombre, telefono, celular, correo);
        this.compania = compania;
        this.extension = extension;
        this.webpage = webpage;
    }
/**
     * Metodo para obtener la compania del Cliente
     *
     * @return String La compania del Cliente
     */
    public String getCompania() {
        return compania;
    }

/**
     * Metodo para obtener la extension del Cliente
     *
     * @return int La extension del Cliente
     */
    public int getExtension() {
        return extension;
    }

/**
     * Metodo para obtener la pagina web del Cliente
     *
     * @return String La pagina web del Cliente
     */
    public String getWebpage() {
        return webpage;
    }
/**
     * Metodo para establecer la compania del Cliente
     *
     * @param compania La compania del Cliente
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }
/**
     * Metodo para establecer la extension del Cliente
     *
     * @param extension La extension del Cliente
     */
    public void setExtension(int extension) {
        this.extension = extension;
    }
/**
     * Metodo para establecer la pagina web del Cliente
     *
     * @param compania La pagina web del Cliente
     */
    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }
/**
     * Metodo para imprimir un contacto Cliente  como una cadena de caracteres
     *
     * @return String El contacto Cliente en formato de cadena de caracter
     */
    @Override
    public String toString() {
        return super.toString() + "\nCompania: " + compania + "Extension: " + extension + "Pagina web: " + webpage;
    }
}
