package geeye;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Gestiona los metodos de los objetos con los que interactuaremos-
 * @author Ian, Cristina y Raimon.
 */
public class Evento {
    //Variables
    private int maxClientes = 100;
    private int maxEspacios = 5;
    private int maxReservas = 100;
    private int cuantosEspacio = 0;
    private int cuantosCliente = 0;
    private int cuantosReserva = 0;
    
    //ArrayList de Objetos
    ArrayList<Cliente> ArrayCliente = new ArrayList();
    ArrayList<Espacio> ArrayEspacios = new ArrayList();
    ArrayList<Reserva> ArrayReserva = new ArrayList();
       
         
    //Arrays de Objetos.
    Reserva[] arrayReservas = new Reserva[maxReservas];
    Cliente[] arrayClientes = new Cliente[maxClientes];
    Espacio[] arrayEspacios = new Espacio[maxEspacios];
    
    //Constructor
    
    public Evento() {    
        ArrayEspacios.add(new Espacio ("Cartuja", 500, true));
        ArrayEspacios.add(new Espacio ("Vallesa de Mandor", 150, false));
        ArrayEspacios.add(new Espacio ("Palacio de los Congresos", 50, true));
        ArrayEspacios.add( new Espacio ("Hotel Las Arenas", 100, true));
        cuantosEspacio = 4;
    }
    
    //Metodos
    public ArrayList<Espacio> buscarNombre(String nombre){
        //ArrayList encontrados (temporal, muestra coincidencias con nombre)
        ArrayList<Espacio> encontrados = new ArrayList();
        for (int i = 0; i < ArrayEspacios.size(); i++) {
            if ( ArrayEspacios.get(i).getNombre().toUpperCase().contains(nombre.toUpperCase()) )
                encontrados.add(ArrayEspacios.get(i));
        }
        for (int i = 0; i < encontrados.size(); i++) {
            System.out.print("Posicion: " + i + " ");
            encontrados.get(i).imprimirEspacio();
        }
        return encontrados;
        
    }
    
    
    public void verEspacios(){
        if(ArrayEspacios.isEmpty())
            System.out.println("Lo siento, cree un espacio primero");
        else{
            for (int i = 0; i < ArrayEspacios.size(); i++) {
                System.out.print(i + ". ");
                ArrayEspacios.get(i).imprimirEspacio();
            }
        }
    }
    
    public void anyadirEspacio(String nombre, int aforo, boolean esInterior){
        ArrayEspacios.add(new Espacio (nombre, aforo, esInterior));
    }

    public void eliminarEspacio(String nombre, int posicion) {
        if ( posicion >= 0){
            for (int i = posicion ; i < buscarNombre(nombre).size() ; i++) {
                ArrayEspacios.remove(posicion);
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
            for (int i = borrar +1; i <= cuantosCliente; i++) {
                arrayClientes[i - 1] = arrayClientes[i];
            }
            cuantosCliente --;
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
                System.out.print("POSICION: " + i + " ");
                arrayReservas[i].imprimir();
            }
        }
    }
    
    public void anyadirReserva(String fechaReserva, int idReserva, int numComensales, boolean pagado, Espacio arrayEspacios[]){
        Scanner in = new Scanner(System.in);
        if(cuantosReserva < maxReservas){
            for (int i = 0; i < cuantosEspacio ; i++) {
                if(arrayEspacios[i].getAforo() >= numComensales){
                    System.out.print("Num. Espacio: " + i + " .");
                    arrayEspacios[i].imprimirEspacio();
                }
            }
            System.out.println("Elige numero de espacio");
            int numEspacio = in.nextInt();
            arrayReservas[cuantosReserva]= new Reserva(fechaReserva, idReserva, numComensales, pagado, arrayEspacios[numEspacio]);
            cuantosReserva++;
        }
    }
           
    public void eliminarReserva(int borrarReserva){
        if ( borrarReserva >= 0 && borrarReserva <= cuantosReserva ){
            for (int i = borrarReserva +1; i <= cuantosReserva; i++) {
                arrayReservas[i - 1] = arrayReservas[i];
            }
            cuantosReserva --;
        }
        else 
            System.err.println("POSICIÓN INCORRECTA");
        System.out.println("Reserva en la posición: " + borrarReserva + " borrada.");
    }

    public void buscarCliente(String nombre){
        for (int i = 0; i < cuantosCliente; i++) {
            if (arrayClientes[i].getNombre().equalsIgnoreCase(nombre)) {
                arrayClientes[i].imprimirCliente();
            }
        }
    }
    
    public void buscarReserva(int idReserva){
        for (int i = 0; i < cuantosReserva; i++) {
            if(arrayReservas[i].getIdReserva()==idReserva)
                arrayReservas[i].imprimir();
            else
                System.out.println("ID no encontrado.");
        }
    }

    
}
