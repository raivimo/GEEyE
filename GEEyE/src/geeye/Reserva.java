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
    private int fechaReserva;
    private int idReserva;
    private int numComensales;
    private boolean pagado;

    //Constructor
    public Reserva(int fechaReserva, int idReserva, int numComensales, boolean pagado){
        this.fechaReserva = fechaReserva;
        this.idReserva = idReserva;
        this.numComensales = numComensales;
        this.pagado = pagado;
    }
    
    //Getters
    public int getFechaReserva() {
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
    public void setFechaReserva(int fechaReserva) {
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
        System.out.println("Fecha de la Reserva: " + fechaReserva + " con Id de Reserva: " + idReserva + " el numero de "
                + "Comensales es: " + numComensales + " y está pagado: " + pagado);
    }

    
}
