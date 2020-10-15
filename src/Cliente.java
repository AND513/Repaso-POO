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
public class Cliente extends ContactoCC {
    private String compania;
    private int extension;
    private String webpage;

    public Cliente(String nombre, int telefono, int celular, String correo, String compania, int extension,
            String webpage) {
        super(nombre, telefono, celular, correo);
        this.compania = compania;
        this.extension = extension;
        this.webpage = webpage;
    }

    public String getCompania() {
        return compania;
    }

    public int getExtension() {
        return extension;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCompania: " + compania + "Extension: " + extension + "Pagina web: " + webpage;
    }
}
