/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo21.accesoaDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo21.entidades.*;

/**
 *
 * @author fojos
 */
public class inscripcionData {

    private Connection conectador = null;
    private AlumnoData ad = new AlumnoData();
    private MateriaData md = new MateriaData();

    public inscripcionData() {

        this.conectador = Conexion.conectorCin();

    }

    public void guardarInscripcion(inscripcion anotado) {
        String sqlo = "INSERT INTO inscripcion(nota ,idalumno ,idmateria) VALUES (?,?,?)";
        try {
            PreparedStatement upa = conectador.prepareStatement(sqlo, Statement.RETURN_GENERATED_KEYS);
            upa.setInt(1, anotado.getAlumnox().getIdalumno());
            upa.setInt(2, anotado.getMateriax().getIdMateria());
            upa.setInt(3, anotado.getNota());
            upa.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "exploto" + ex.getMessage());
        }

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps = conectador.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps = conectador.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Inscripción borrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error acceder tabla inscripcion");
        }
    }

    public List<inscripcion> ObtenerInscripciones() {
        ArrayList<inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        PreparedStatement ps;
        try {
            ps = conectador.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                inscripcion ins = new inscripcion();
                ins.setIdinscripcion(rs.getInt("idinscripcion"));
                Alumno alu = ad.buscador(rs.getInt("idAlumno"));
                Materia mat = md.buscadorex(rs.getInt("idMateria"));
                ins.setAlumnox(alu);
                ins.setMateriax(mat);
                ins.setIdinscripcion(rs.getInt("idinscripcion"));

                cursadas.add(ins);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error acceder tabla inscripcion");
        }
        return cursadas;

    }

    public List<inscripcion> ObtenerInscripcionesPorAlumno(int idAlumno) {
        ArrayList<inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno=?";
         try {
             PreparedStatement ps= conectador.prepareStatement(sql);
             ps.setInt(1, idAlumno);
       
       
             
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                inscripcion ins = new inscripcion();
                ins.setIdinscripcion(rs.getInt("idinscripcion"));
                Alumno alu = ad.buscador(rs.getInt("idAlumno"));
                Materia mat = md.buscadorex(rs.getInt("idMateria"));
                ins.setAlumnox(alu);
                ins.setMateriax(mat);
                ins.setIdinscripcion(rs.getInt("idinscripcion"));

                cursadas.add(ins);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error acceder tabla inscripcion");
        }
        return cursadas;

    }
    
    
    

}
