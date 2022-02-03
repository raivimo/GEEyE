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
    
    public Eventos() {    
        arrayEspacios[0] = new Espacio ("Cartuja", 500, true);
        arrayEspacios[1] = new Espacio ("Vallesa de Mandor", 150, false);
        arrayEspacios[2] = new Espacio ("Palacio de los Congresos", 50, true);
    }
    
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
    
    /*public void anyadirEspacio(String nombre, int aforo, boolean esInterior){
        if( cuantosEspacio > 5)
            System.err.println("Máximo numero de espacios alcanzado, borre uno.");
        else{
            arrayEspacios[cuantosEspacio] = new Espacio (nombre, aforo, esInterior);
            cuantosEspacio++;
        }
    }
*/
    
    public void eliminarEspacio(int posicion) {
        if ( posicion >= 0){
            for (int i = posicion + 1; i < cuantosEspacio; i++) {
                arrayEspacios[i-1] = arrayEspacios[i];
                cuantosEspacio--;
            }
        }
        else
            System.err.println("POSICIÓN INCORRECTA");
        System.out.println("Espacio de la posicion: " + posicion + " borrado.");
    }
    
    public void verClientes(){
        if (cuantosCliente == 0)
            System.out.println("No hay Clientes registrados todavia");
        else{
            for (int i = 0; i < cuantosCliente; i++) {
                System.out.print(i+" . ");
                arrayClientes[i].imprimirCliente();
            }
        }
    }
    
    public void anyadirCliente(String nombre, String apellidos, int numCliente, String direccion, String telf){
        if( cuantosCliente > 100)
            System.err.println("Máximo de clientes alcanzado");
        else{
            arrayClientes[cuantosCliente] = new Cliente (nombre, apellidos, numCliente, direccion, telf);
            cuantosCliente++;
        }
    }
    
    public void eliminarCliente(int borrar){
        if ( borrar >= 0){
            for (int i = borrar +1; i < cuantosCliente; i++) {
                arrayClientes[i - 1] = arrayClientes[i];
                cuantosCliente --;

            }
        }
        else 
            System.err.println("POSICIÓN INCORRECTA");
        System.out.println("Cliente en la posición: "+ borrar+ " borrado.");
    }
        
    public void verReservas(){
        if (cuantosReserva == 0)
            System.out.println("No hay reservas pendientes");
        else{
            for (int i = 0; i < cuantosReserva; i++) {
                arrayReservas[i].imprimir();
            }
        }
    }
    
    public void anyadirReserva(String fechaReserva, int idReserva, int numComensales, boolean pagado){
        for (int i = 0; i < cuantosEspacio; i++) {
            if(arrayEspacios[i].getAforo() <= numComensales){
                arrayReservas[cuantosReserva] = new Reserva(fechaReserva, idReserva, numComensales, pagado);
                cuantosReserva++;
                System.out.println("Reserva realizada correctamente.");
            }
        }
    }
    
    
   
    public void eliminarReserva(int borrarReserva){
        if ( borrarReserva >= 0){
            for (int i = borrarReserva +1; i < cuantosReserva; i++) {
                arrayReservas[i - 1] = arrayReservas[i];
                cuantosReserva --;
            }
        }
        else 
            System.err.println("POSICIÓN INCORRECTA");
        System.out.println("Reserva en la posición: " + borrarReserva + " borrada.");
    }
}
