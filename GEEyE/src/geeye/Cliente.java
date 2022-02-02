/*
 * Proyecto EjerciciosProgramacionJava - Archivo Cliente.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package EntregablePOO;

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

    public Cliente(String nombre, String apellidos, String direccion, String telf, int numCliente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telf = telf;
        this.numCliente = numCliente;
    }
    

}
