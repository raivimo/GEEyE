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
                    equipo.verEspacios();
                    break;
                case 4:
                    in.nextLine();
                    System.out.println("Introduce nombre del Espacio");
                    String nombre = in.nextLine();
                    System.out.println("Introduce Aforo del Espacio");
                    int aforo = in.nextInt();
                    System.out.println("¿Es interior? (true/false");
                    boolean esInterior = in.nextBoolean();
                    equipo.anyadirEspacio(nombre, aforo, esInterior);
                    break;
                case 5:
                    equipo.verEspacios();
                    System.out.println("Intruduce nº posición del espacio que deseas borrar");
                    int borrarEspacio = in.nextInt();
                    equipo.eliminarEspacio(borrarEspacio);
                    break;
                case 6:
                    
                case 12:
                    salir = true;
                    break;
                      
            }
            
        } while (salir ==false );
        
        
    }
}
