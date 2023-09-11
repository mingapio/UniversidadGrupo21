/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo21.accesoaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 21
 */
public class Conexion {

    private static Connection conectar;

    private Conexion() {
    }

    public static Connection conectorCin() {
        if (conectar == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidad_punta", "root", "");

            } catch (ClassNotFoundException con) {
                JOptionPane.showMessageDialog(null, "error al cargar dirver" + con.getMessage());

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error al conectar" + ex.getMessage());
            }
        }
        return conectar;
    }

}
