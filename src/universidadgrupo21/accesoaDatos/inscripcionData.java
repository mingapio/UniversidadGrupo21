/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo21.accesoaDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo21.entidades.*;

/**
 *
 * @author fojos
 */
public class inscripcionData {
    private Connection conectador=null;
    public inscripcionData(){
    
    this.conectador=Conexion.conectorCin();
    
    }
    
    public void guardarInscripcion(inscripcion anotado){
    String sqlo="INSERT INTO inscripcion(nota ,idalumno ,idmateria) VALUES (?,?,?)";
        try {
            PreparedStatement upa= conectador.prepareStatement(sqlo,Statement.RETURN_GENERATED_KEYS);
        upa.setInt(1,anotado.getAlumnox().getIdalumno() );
        upa.setInt(2, anotado.getMateriax().getIdMateria());
        upa.setInt(3, anotado.getNota());
        upa.executeUpdate();
        
        
        
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"exploto"+ ex.getMessage());
        }
    
    }
    
}
