package geeye;

import java.util.Scanner;

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
    
    //Constructor
    public Eventos() {    
        arrayEspacios[0] = new Espacio ("Cartuja", 500, true);
        arrayEspacios[1] = new Espacio ("Vallesa de Mandor", 150, false);
        arrayEspacios[2] = new Espacio ("Palacio de los Congresos", 50, true);
        arrayEspacios[3] = new Espacio ("Hotel Las Arenas", 100, true);
        cuantosEspacio = 4;
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
    
    public void anyadirEspacio(String nombre, int aforo, boolean esInterior){
        if( cuantosEspacio > 5)
            System.err.println("Máximo numero de espacios alcanzado, borre uno.");
        else{
            arrayEspacios[cuantosEspacio] = new Espacio (nombre, aforo, esInterior);
            cuantosEspacio++;
        }
    }

    public void eliminarEspacio(int posicion) {
        if ( posicion >= 0){
            for (int i = posicion + 1; i < cuantosEspacio; i++) {
                arrayEspacios[i-1] = arrayEspacios[i];
            }
            cuantosEspacio--;
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
