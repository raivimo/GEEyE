/*
 * Proyecto EjerciciosProgramacionJava - Archivo Reserva.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package geeye;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 1 feb. 2022 16:16:27
 */
public class Reserva {
    //Atributos
    private String fechaReserva;
    private int idReserva;
    private int numComensales;
    private boolean pagado;
    private Espacio espacioAsignado;

    //Constructor
    public Reserva(String fechaReserva, int idReserva, int numComensales, boolean pagado, Espacio espacioAsignado){
        this.fechaReserva = fechaReserva;
        this.idReserva = idReserva;
        this.numComensales = numComensales;
        this.pagado = pagado;
        this.espacioAsignado = espacioAsignado;
    }
    
    //Getters
    public String getFechaReserva() {
        return fechaReserva;
    }
    
    public int getIdReserva() {
        return idReserva;
    }
    
    public int getNumComensales() {
        return numComensales;
    }
    
    public boolean getPagado() {
        return pagado;
    }
    
    //Setters
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setNumComensales(int numComensales) {
        this.numComensales = numComensales;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    //Metodos
    public void imprimir(){
        System.out.println("FECHA RESERVA: " + fechaReserva + " Id RESERVA: " + idReserva + " "
                + "Nº.COMENSALES: " + numComensales + " ¿PAGADO? " + pagado + " ESPACIO ASIGNADO: " + espacioAsignado.getNombre());
    }

    
}
