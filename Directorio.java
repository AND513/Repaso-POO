import java.util.Scanner;
import static java.lang.System.*;

/**
 * Clase para
 *
 * @author Cruz Barrios Luis Alberto, Flores Molina Alfredo, Fernandez Neria
 *         Montserrat, Maya Sanchez Andrea Fernanda, Ortiz Covarrubias Andres
 *         Uriel, Lopez Espindola Luis Enrique
 * @version Septiembre 2020
 */
public class Directorio {
    private int na;
    private Contacto contactos[];
    private Scanner lector;
    private Scanner lector1;

    public Directorio() {
        this(3);
    }

    public Directorio(int n) {
        contactos = new Contacto[n];
        na = 0;
        lector = new Scanner(in);
        lector1 = new Scanner(in).useDelimiter("\n");
    }

    public boolean estaVacio() {
        return na == 0;
    }

    public boolean estaLleno() {
        return na == contactos.length;
    }

    public void agregar(Contacto contacto) {
        if (estaLleno()) // Si el directorio esta lleno se aumenta el tamanio del arreglo
            crecerArreglo(1);
        contactos[na++] = contacto;
    }

    public Contacto buscarContacto(String nombre) {
        if (!estaVacio() && contiene(nombre))
            for (Contacto contacto : contactos) {
                if (contacto.getNombre().equals(nombre)) // Si nombre coincide
                    return contacto;
                break;
            }
        else
            return null;
    }

    public Contacto bucarCategoria(String nombre, String categoria) {
        if (!estaVacio() && contiene(nombre))
            for (Contacto contacto : contactos) {
                if (categoria.equals("amigo")) {
                    if (contacto.getNombre().equals(nombre) && contacto instanceof Amigo) // Si nombre coincide y es
                                                                                          // Amigo
                        return contacto;
                    break;
                } else if (categoria.equals("familiar")) {
                    if (contacto.getNombre().equals(nombre) && contacto instanceof Familiar) // Si nombre coincide y es
                                                                                             // Familiar
                        return contacto;
                    break;
                } else if (categoria.equals("cliente")) {
                    if (contacto.getNombre().equals(nombre) && contacto instanceof Cliente) // Si nombre coincide y es
                                                                                            // Cliente
                        return contacto;
                    break;
                }
            }
        else
            return null;
    }

    private boolean contiene(String nombre) {
        boolean respuesta = false;
        if (!estaVacio()) // Si hay Contactos almacenados
            for (int i = 0; i < na; i++) // Buscamos el Contactos
                if (nombre.equals(contactos[i].getNombre())) { // Lo encontro
                    respuesta = true;
                    break;
                }
        return respuesta;
    }

    private void crecerArreglo(int k) {
        int nuevoTam = contactos.length + k; // Definimos el nuevo tamaño
        Contacto conts[] = new Contacto[nuevoTam];
        for (int i = 0; i < contactos.length; i++) { // Copiamos los elementos desde el arreglo original al nuevo
            conts[i] = contactos[i];
        }
        // Actualizar el arreglo orginal, sustituyendolo por el nuevo
        contactos = conts;
    }
}