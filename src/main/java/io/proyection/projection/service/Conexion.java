package io.proyection.projection.service;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar() {
        Connection conex = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/heroku_c6af40073f8f169?reconnect=true";
            conex = DriverManager.getConnection(url, "b3a2b64f982396", "d4c8cc03");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return conex;
    }

    public static void cerrar(Connection conex) {
        try {
            conex.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
