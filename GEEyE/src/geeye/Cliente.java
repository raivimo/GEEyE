/*
 * Proyecto EjerciciosProgramacionJava - Archivo Cliente.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package geeye;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 1 feb. 2022 16:16:21
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telf;
    private int numCliente;

    public Cliente(String nombre, String apellidos, int numCliente, String direccion, String telf) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telf = telf;
        this.numCliente = numCliente;
    }
    
    //METODOS
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public String getTelefono(){
        return telf;
    }

    public int getNumCliente() {
        return numCliente;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public void setNumCliente(int numCliente){
        this.numCliente = numCliente;
    }
    
    public void imprimirCliente(){
        System.out.println("NOMBRE DEL CLIENTE: " + nombre + " APELLIDOS: " + apellidos + " Nº.CLIENTE :" + numCliente + " DIRECCION :" + direccion + " TELEFONO: " + telf);
    }
    
}
