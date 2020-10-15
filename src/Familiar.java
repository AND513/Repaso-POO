/**
 * Clase que permite modelar un Familiar a partir de un Contacto
 * @author Cruz Barrios Luis Alberto
 * @author Flores Molina Alfredo
 * @author Fernandez Neria Montserrat
 * @author Maya Sanchez Andrea Fernanda 
 * @author Ortiz Covarrubias Andres Uriel
 * @author Lopez Espindola Luis Enrique
 * @version Octubre 2020
 * @see Contacto
 */
public class Familiar extends Contacto {
    private String parentesco;
    private String cumpleanios;
 /**
     * Constructor que recibe parametros
     *
     * @param nombre   El nombre de Familiar
     * @param telefono El telefono casa de Familiar 
     * @param parentesco  El parentesco de Familiar
     * @param cumpleanios El cumpleanios de Familiar
     */
    public Familiar(String nombre, int telefono, String parentesco, String cumpleanios) {
        super(nombre, telefono);
        this.parentesco = parentesco;
        this.cumpleanios = cumpleanios;
    }
/**
     * Metodo para obtener el parentesco de Familiar
     *
     * @return String el parentesco de Familiar
     */
    public String getParentesco() {
        return parentesco;
    }

/**
     * Metodo para obtener el cumpleanios de Familiar
     *
     * @return String el cumpleanios de Familiar
     */
    public String getCumpleanios() {
        return cumpleanios;
    }
 /**
     * Metodo para establecer el parentesco de Familiar
     *
     * @param parentesco El parentesco de Familiar
     */
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

 /**
     * Metodo para establecer el cumpleanios de Familiar
     *
     * @param cumpleanios El cumpleanios de Familiar
     */
    public void setCumpleanios(String cumpleanios) {
        this.cumpleanios = cumpleanios;
    }
/**
     * Metodo para imprimir un contacto Familiar como una cadena de caracteres
     *
     * @return String El contacto Familar en formato de cadena de caracter
     */
    @Override
    public String toString() {
        return super.toString() + "\nParentesco: " + parentesco + "Cumpleanios: " + cumpleanios;
    }
}
