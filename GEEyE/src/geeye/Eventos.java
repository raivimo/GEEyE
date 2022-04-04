/*
 * Proyecto GEEyE - Archivo Eventos.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package geeye;

import java.util.Date;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 4 abr. 2022 18:38:04
 */
public class Eventos {
    private int id;
    private String nombre_espacio;
    private int comensales;
    private Date fecha;
    private boolean pagado;
    private double precioCubierto;
    
    /**
     * Constructor
     * @param id CLAVE PRIMARIA
     * @param nombre_espacio NOMBRE DEL ESPACIO
     * @param comensales NUMERO DE COMENSALES
     * @param fecha FECHA DEL EVENTO
     * @param pagado PAGADO O NO
     * @param precioCubierto PRECIO DEL CUBIERTO
     */
    public Eventos(int id, String nombre_espacio, int comensales, Date fecha, boolean pagado, double precioCubierto) {
        this.id = id;
        this.nombre_espacio = nombre_espacio;
        this.comensales = comensales;
        this.fecha = fecha;
        this.pagado = pagado;
        this.precioCubierto = precioCubierto;
    }
    
    
    
    
    //Getters
    public int getId() {
        return id;
    }

    public String getNombre_espacio() {
        return nombre_espacio;
    }

    public int getComensales() {
        return comensales;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isPagado() {
        return pagado;
    }

    public double getPrecioCubierto() {
        return precioCubierto;
    }
    
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre_espacio(String nombre_espacio) {
        this.nombre_espacio = nombre_espacio;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public void setPrecioCubierto(double precioCubierto) {
        this.precioCubierto = precioCubierto;
    }
    
    
    
        
}
