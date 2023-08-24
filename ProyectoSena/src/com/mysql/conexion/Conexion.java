package com.mysql.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD = "Jesa200420052468";
    private static String URL = "jdbc:mysql://localhost:3306/proyectosena";

    static {
        try {
            Class.forName(DRIVER);

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL DRIVER" + e);
        }
    }

    public Connection getConnection() {

        Connection con = null;

        try {

            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONEXION" + e);

        }
        return con;

    }
}
