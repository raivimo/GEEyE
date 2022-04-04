package geeye;

import java.net.URL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador {
    
    String bd = "";
    String url = "jdbc:mysql://localhost:3306/catering";
    String user = "admin";
    String password = "ausias2021";
    String driver= "com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    
    public Controlador (String bd) {
        this.bd=bd;
    }

    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+bd, user, password);
            System.out.println("SE CONECTÓ A BD " + bd);
        } catch (SQLException ex) {
            System.out.println("NO SE CONECTÓ A BD" + bd);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    
    public void desconectar(){
        try{
            cx.close();
        }catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Variables de conexión
    public static Connection cx;
    public static Statement stm;
    public static ResultSet rs;
    public static boolean ok;

    public static void conectar() {
        try {
            cx = DriverManager.getConnection(url, user, password);
            stm = cx.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void main(String[] args) {
        
        try {
            

            
            ResultSet rs = statement.executeQuery("SELECT * FROM eventos");

            while (rs.next()) {

                int id = rs.getInt("id");
                String nombre_espacio = rs.getString("nombre_espacio");
                int comensales = rs.getInt("comensales");
                Date fecha = rs.getDate("fecha");
                boolean pagado = rs.getBoolean("pagado");
                double precioCubierto = rs.getDouble("precioCubierto");

                System.out.println(String.format("%d, %s, %s, %s, %s, %s", id, nombre_espacio, comensales, fecha, pagado, precioCubierto));
            }

            // insertar
            statement.execute("INSERT INTO eventos VALUES(2, 'Paquita', 123, '2019-05-25', true, 20.0)");
            System.out.println("========================================================================");
            rs = statement.executeQuery("SELECT * FROM eventos");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre_espacio = rs.getString("nombre_espacio");
                int comensales = rs.getInt("comensales");
                Date fecha = rs.getDate("fecha");
                boolean pagado = rs.getBoolean("pagado");
                double precioCubierto = rs.getDouble("precioCubierto");

                System.out.println(String.format("%d, %s, %s, %s, %s, %s", id, nombre_espacio, comensales, fecha, pagado, precioCubierto));
            }

            rs.close();
            statement.close();
            connection.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    
    
}
