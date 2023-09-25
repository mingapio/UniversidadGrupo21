/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo21.accesoaDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo21.entidades.Alumno;
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
            ups.setBoolean(3, matex.getEstado());
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
        String sql = "UPDATE materia SET nombre=?,año=?,estado=? WHERE idmateria =?";
        try {
            PreparedStatement ups = enchufe.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ups.setString(1, matex.getNombre());
            ups.setInt(2, matex.getAño());
            ups.setBoolean(3, matex.getEstado());
            ups.setInt(4, matex.getIdMateria());

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


    public Materia buscadorex(int id) {
         String sql="SELECT  `nombre`, `año`, `estado` FROM `materia` WHERE idmateria=? AND estado=1";
         Materia escu= null;
         try {
          PreparedStatement ups= enchufe.prepareStatement(sql);
          ups.setInt(1, id);
          ResultSet answer = ups.executeQuery();
          
          if(answer.next()){
            escu= new Materia();
            escu.setIdMateria(id);
            escu.setNombre(answer.getNString("nombre"));
            escu.setAño(answer.getInt("año"));
            escu.setEstado(true);
            
          
          }else{
          JOptionPane.showMessageDialog(null,"la cagaste hermano");
          
          
          }
         ups.close();
         
         
         } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
       
         }
        return escu;


}

     public List<Materia> listadorex() {

        String sql = " SELECT idmateria ,nombre ,año ,estado FROM materia WHERE estado =1";
       ArrayList<Materia> aldope = new ArrayList<>();
        try {
            PreparedStatement ps = enchufe.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
             Materia nose = new Materia();
              nose.setIdMateria(rs.getInt("idmateria"));
              nose.setNombre(rs.getString("nombre"));
              nose.setAño(rs.getInt("año"));
              nose.setEstado(true);
              aldope.add(nose);
            }

              
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error porque se me canto" + ex.getMessage());
        }
        return aldope;
    }

    
}
