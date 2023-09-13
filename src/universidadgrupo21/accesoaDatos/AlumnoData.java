/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo21.accesoaDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo21.entidades.Alumno;

/**
 *
 * @author Grupo 21
 */
public class AlumnoData {

    private Connection cn = null;

    public AlumnoData() {
        cn = Conexion.conectorCin();

    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumno (dni, nombre, apellido, nacimiento, estado)"
                + "VALUES (?,?,?,?,?) ";

        try {
            PreparedStatement ps = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setDate(4, Date.valueOf(alumno.getNacimiento()));
            ps.setBoolean(5, alumno.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                alumno.setIdalumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
    }

    public void modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno SET dni = ?, nombre= ?, apellido = ?, nacimiento = ? "
                + "WHERE idalumno = ?";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setDate(4, Date.valueOf(alumno.getNacimiento()));
            ps.setInt(5, alumno.getIdalumno());
            ps.setBoolean(6, true);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
    }

    public void eliminarAlumno(int id) {

        String sql = "UPDATE alumno set estado = 0 WHERE idalumno = ?";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            int exit = ps.executeUpdate();
            if (exit == 1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }

    }

    public Alumno buscador(int id) {

        String sql = " SELECT DNI ,nombre ,apellido ,nacimiento ,estado FROM alumno WHERE idalumno = ?  AND estado =1";
        Alumno pibe = null;
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pibe = new Alumno();
                pibe.setIdalumno(id);
                pibe.setDni(rs.getInt("DNI"));
                pibe.setNombre(rs.getString("nombre"));
                pibe.setApellido(rs.getString("apellido"));
                pibe.setNacimiento(rs.getDate("nacimiento").toLocalDate());
                pibe.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "sos un fantasma");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error porque se me canto" + ex.getMessage());
        }
        return pibe;
    }

    public List<Alumno> listador() {

        String sql = " SELECT idalumno ,DNI ,nombre ,apellido ,nacimiento ,estado FROM alumno WHERE estado =1";
       ArrayList<Alumno> pibes = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
             Alumno pibe = new Alumno();
                pibe.setIdalumno(rs.getInt("idalumno"));
                pibe.setDni(rs.getInt("DNI"));
                pibe.setNombre(rs.getString("nombre"));
                pibe.setApellido(rs.getString("apellido"));
                pibe.setNacimiento(rs.getDate("nacimiento").toLocalDate());
                pibe.setEstado(true);
                pibes.add(pibe);
            }

              
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error porque se me canto" + ex.getMessage());
        }
        return pibes;
    }

}
