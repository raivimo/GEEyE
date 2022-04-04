package geeye;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Gestiona los metodos de los objetos con los que interactuaremos-
 * @author Ian, Cristina y Raimon.
 */
public class Evento {
          
    //ArrayList de Objetos
    ArrayList<Cliente> ArrayClientes = new ArrayList();
    ArrayList<Espacio> ArrayEspacios = new ArrayList();
    ArrayList<Reserva> ArrayReservas = new ArrayList();
       
    //Constructor
    public Evento() {    
        ArrayEspacios.add(new Espacio ("Cartuja", 500, true));
        ArrayEspacios.add(new Espacio ("Vallesa de Mandor", 150, false));
        ArrayEspacios.add(new Espacio ("Palacio de los Congresos", 50, true));
        ArrayEspacios.add( new Espacio ("Hotel Las Arenas", 100, true));
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
        if ( ArrayClientes.isEmpty() )
            System.out.println("No hay Clientes registrados todavia");
        else{
            for (int i = 0; i < ArrayClientes.size() ; i++) {
                System.out.print(i+" . ");
                ArrayClientes.get(i).imprimirCliente();
            }
        }
    }
    
    public void anyadirCliente(String nombre, String apellidos, int numCliente, String direccion, String telf){
        ArrayClientes.add( new Cliente (nombre, apellidos, numCliente, direccion, telf) );      
    }
    
    public void eliminarCliente(int borrar){
        if ( borrar >= 0 && borrar <= ArrayClientes.size() ){
            for (int i = borrar ; i <= ArrayClientes.size() ; i++) {
                ArrayClientes.remove(borrar);
            }
        }
        else //Lanzar excepcion
            System.err.println("POSICIÓN INCORRECTA");
        System.out.println("Cliente en la posición: "+ borrar+ " borrado.");
    }
        
    public void verReservas(){
        if ( ArrayReservas.isEmpty() )
            System.out.println("No hay reservas pendientes");
        else{
            for (int i = 0; i < ArrayReservas.size() ; i++) {
                System.out.print("Posición: " + i + " ");
                ArrayReservas.get(i).imprimir();
            }
        }
    }
    
    public void anyadirReserva(String fechaReserva, int idReserva, int numComensales, boolean pagado, Espacio arrayEspacios[]){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < ArrayReservas.size() ; i++) {
            if(ArrayEspacios.get(i).getAforo() >= numComensales){
                    System.out.print("Num. Espacio: " + i + " .");
                    ArrayEspacios.get(i).imprimirEspacio();
            }
        }
        System.out.println("Elige numero de espacio");
        int numEspacio = in.nextInt();
        ArrayReservas.add(new Reserva(fechaReserva, idReserva, numComensales, pagado, arrayEspacios[numEspacio]));
    }
           
    public void eliminarReserva(int borrarReserva){
        if ( borrarReserva >= 0 && borrarReserva <= ArrayReservas.size()  ){
            for (int i = borrarReserva; i <= ArrayReservas.size() ; i++) {
                ArrayReservas.remove(borrarReserva);
            }
        }
        else 
            System.err.println("POSICIÓN INCORRECTA");//Lanzar Excepcion
        System.out.println("Reserva en la posición: " + borrarReserva + " borrada.");
    }

    public ArrayList<Cliente> buscarCliente(String nombre){
        //ArrayList encontrados (temporal, muestra coincidencias con nombre)
        ArrayList<Cliente> encontrados = new ArrayList();
        for (int i = 0; i < ArrayClientes.size(); i++) {
            if ( ArrayClientes.get(i).getNombre().toUpperCase().contains(nombre.toUpperCase()) )
                encontrados.add(ArrayClientes.get(i));
        }
        for (int i = 0; i < encontrados.size(); i++) {
            System.out.print("Posicion: " + i + " ");
            encontrados.get(i).imprimirCliente();
        }
        return encontrados;
        
    }

    
    public ArrayList<Reserva> buscarReserva(int idReserva){
        ArrayList<Reserva> encontrados = new ArrayList();
        for (int i = 0; i < ArrayReservas.size() ; i++) {
            if(ArrayReservas.get(i).getIdReserva() == idReserva)
                ArrayReservas.get(i).imprimir();
            else
                System.out.println("ID no encontrado.");//Lanzar excepcion
        }
        return encontrados;
    }

    
}
