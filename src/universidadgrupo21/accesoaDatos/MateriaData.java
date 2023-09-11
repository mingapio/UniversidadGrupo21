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
import universidad.materia;
/**
 *
 * @author fojos
 */
public class MateriaData {
    private Connection enchufe;
    
    public MateriaData(){
    enchufe = Conexion.conectorCin();
    }
    
    public void cargarMaterias(materia matex){
        try {
            String sql = "INSERT INTO `materia`(`nombre`, `año`, `estado`) VALUES (?,?,?)";
            
            PreparedStatement ups = enchufe.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ups.setString(1, matex.getNombre());
            ups.setDate(2, Date.valueOf(matex.getAño()));
            ups.setBoolean(3, true);
            ups.executeUpdate();
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"el ordenador esta a punto de explotar"+ex.getMessage());
        }
    
    
    
    }
   public void modificarMateria(materia matex){} 

}
