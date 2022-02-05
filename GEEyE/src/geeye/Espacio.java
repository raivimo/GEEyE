/*
 * Proyecto EjerciciosProgramacionJava - Archivo Espacio.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package geeye;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 1 feb. 2022 16:15:54
 */
public class Espacio {
    
    // Atributos
    private String nombre;
    private int aforo;
    private boolean esInterior;
            
    // Constructor
    public Espacio(String nombre, int aforo, boolean esInterior) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.esInterior = esInterior;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public boolean isInteriorExterior() {
        return esInterior;
    }

    public void setInteriorExterior(boolean esInterior) {
        this.esInterior = esInterior;
    }
    
    // Imprimir la inforción del espacio
    public void imprimirEspacio(){
        System.out.println("NOMBRE ESPACIO: " + nombre + " AFORO: " + aforo + " ¿ES INTERIOR? " + esInterior);
    }
    
}
