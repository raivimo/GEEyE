/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package geeye;


import java.util.Scanner;


/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 1 feb. 2022 16:15:48
 */
public class Main {
  
    public static void menu(){ 
        System.out.println("==BIENVENIDO A GESTIÓN DE ESPACIOS Y EVENTOS==");
        System.out.println("==========POR IAN, CRISTINA Y RAIMON==========");
        System.out.println("");
        System.out.println("======== Seleciona una opción del Menú =======");
        System.out.println("1.- Ver Espacios Disponibles.");
        System.out.println("2.- Ver Clientes");
        System.out.println("3.- Ver Reservas");
        System.out.println("4.- Añadir Espacio");
        System.out.println("5.- Eliminar Espacio");
        System.out.println("6.- Añadir Cliente");
        System.out.println("7.- Eliminar Cliente");
        System.out.println("8.- Buscar Cliente");
        System.out.println("9.- Añadir Reserva");
        System.out.println("10.- Eliminar/Cancelar Reserva");
        System.out.println("11.- Buscar Reserva");
        System.out.println("12.- Salir");
        }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Eventos equipo = new Eventos ();
        boolean salir = false;
        
        do {
            menu();
            int opcion = in.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("--------  ESPACIOS ----------");
                    equipo.verEspacios();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("--------  CLIENTES ----------");
                    equipo.verClientes();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("--------  RESERVAS ----------");
                    equipo.verReservas();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("--------  AÑADIR ESPACIO ----------");
                    in.nextLine();
                    System.out.println("Introduce nombre del Espacio");
                    String nombre = in.nextLine();
                    System.out.println("Introduce Aforo del Espacio");
                    int aforo = in.nextInt();
                    System.out.println("¿Es interior? (true/false");
                    boolean esInterior = in.nextBoolean();
                    equipo.anyadirEspacio(nombre, aforo, esInterior);
                    System.out.println("");
                    break; 
                case 5:
                    System.out.println("--------  BORRAR ESPACIO ----------");
                    equipo.verEspacios();
                    System.out.println("Intruduce nº posición del espacio que deseas borrar");
                    int borrarEspacio = in.nextInt();
                    equipo.eliminarEspacio(borrarEspacio);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("--------  AÑADIR CLIENTE ----------");
                    in.nextLine();
                    System.out.println("Introduce nombre del Cliente: ");
                    nombre = in.nextLine();
                    System.out.println("Introduce apellidos del Cliente: ");
                    String apellidos = in.nextLine();
                    System.out.println("Introduce el número de Cliete: ");
                    int numCliente = in.nextInt();
                    in.nextLine();
                    System.out.println("Introduce la dirección");
                    String direccion = in.nextLine();
                    System.out.println("Introduce el teléfono: ");
                    String telf = in.nextLine();
                    equipo.anyadirCliente(nombre, apellidos, numCliente, direccion, telf);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("--------  BORRAR CLIENTE ----------");
                    equipo.verClientes();
                    System.out.println("Introduce la posición del cliente a borrar: ");
                    int posCliente = in.nextInt();
                    equipo.eliminarCliente(posCliente);
                    System.out.println("");
                    break;
                case 8:
                    in.nextLine();
                    System.out.println("--------  BUSCAR CLIENTE ----------");
                    System.out.println("Dime el nombre del Cliente a buscar: ");
                    nombre = in.nextLine();
                    equipo.buscarCliente(nombre);
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("--------  AÑADIR RESERVA ----------");
                    in.nextLine();
                    System.out.println("Dime la fecha del evento: dd/mm/aaaa");
                    String fechaReserva = in.nextLine();
                    System.out.println("Escribe un ID de Reserva:");
                    int idReserva = in.nextInt();
                    System.out.println("Dime el Numero de Comensales del Evento");
                    int numComensales = in.nextInt();
                    in.nextLine();
                    System.out.println("¿Vas a pagar ahora la reserva. Si = true / No = false");
                    boolean pagado = in.nextBoolean();
                    equipo.anyadirReserva(fechaReserva, idReserva, numComensales, pagado, equipo.arrayEspacios);
                    System.out.println("");
                    break;
                case 10:
                    System.out.println("--------  BORRAR RESERVA ----------");
                    equipo.verReservas();
                    System.out.println("Dime la posicion de la reserva a borrar: ");
                    int borrarReserva = in.nextInt();
                    equipo.eliminarReserva(borrarReserva);
                    System.out.println("");
                    break;
                case 11:
                    System.out.println("-------- BUSCAR RESERVA ------------");
                    System.out.println("Dime el ID de Reserva");
                    idReserva = in.nextInt();
                    equipo.buscarReserva(idReserva);
                    System.out.println("");
                    break;
                case 12:
                    System.out.println("--------  SALIR ----------");
                    salir = true;
                    break;
                      
            }
            
        } while (salir ==false );
        
        
    }
}
