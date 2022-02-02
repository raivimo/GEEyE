/*
 * Proyecto EjerciciosProgramacionJava - Archivo Eventos.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package geeye;

import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 1 feb. 2022 16:16:39
 */
public class Eventos {
    //Variables
    private int maxClientes = 100;
    private int maxEspacios = 5;
    private int maxReservas = 100;
    private int cuantosEspacio = 0;
    private int cuantosCliente = 0;
    private int cuantosReserva = 0;
          
    //Arrays de Objetos.
    Reserva[] arrayReservas = new Reserva[maxReservas];
    Cliente[] arrayClientes = new Cliente[maxClientes];
    Espacio[] arrayEspacios = new Espacio[maxEspacios];
    
    //Metodos
    public void verEspacios(){
        if(cuantosEspacio == 0)
            System.out.println("Lo siento, cree un espacio primero");
        else{
            for (int i = 0; i < cuantosEspacio; i++) {
                System.out.print(i + ". ");
                arrayEspacios[i].imprimirEspacio();
            }
        }
    }
    
    public void anyadirEspacio(String nombre, int aforo, boolean esInterior){
        Scanner in = new Scanner(System.in);
        if( cuantosEspacio > 5)
            System.err.println("Máximo numero de espacios alcanzado, borre uno.");
        else{
            arrayEspacios[cuantosEspacio] = new Espacio (nombre, aforo, esInterior);
            cuantosEspacio++;
        }
    }
    
    public void eliminarEspacio(int posicion) {
        for (int i = posicion + 1; i < cuantosEspacio; i++) {
            arrayEspacios[i-1] = arrayEspacios[i];
            cuantosEspacio--;
        }
        System.out.println("Espacio de la posicion: " + posicion + " borrado.");
    }
    
    public void anyadirCliente(String nombre, String apellido, int idCliente){
        
    }
    
}
