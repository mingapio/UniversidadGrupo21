/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo21.accesoaDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo21.entidades.Materia;

/**
 *
 * @author fojos
 */
public class MateriaData {

    private Connection enchufe = null;

    public MateriaData() {
        enchufe = Conexion.conectorCin();
    }

    public void cargarMaterias(Materia matex) {

        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?,?,?)";
        try {

            PreparedStatement ups = enchufe.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ups.setString(1, matex.getNombre());
            ups.setInt(2, matex.getAño());
            ups.setBoolean(3, true);
            ups.executeUpdate();

            ResultSet answer = ups.getGeneratedKeys();

            if (answer.next()) {

                matex.setIdMateria(answer.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia agregada");
            }
            ups.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());

        }

    }

    public void modificarMateria(Materia matex) {
        String sql = "UPDATE materia SET nombre=?, año=?, estado=? WHERE nombre =?";
        try {
            PreparedStatement ups = enchufe.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ups.setString(1, matex.getNombre());
            ups.setInt(2, matex.getAño());
            ups.setBoolean(3, matex.getEstado());

            int exito = ups.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "materia modificado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }

    }

    public void eliminarMateria(int id) {
        String sql = "UPDATE materia Set estado =0 WHERE idmateria =? ";
        try {
            PreparedStatement ups = enchufe.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ups.setInt(1, id);
            int exit = ups.executeUpdate();
            if (exit == 1) {
                JOptionPane.showMessageDialog(null, "materia borrada");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
    }

}
