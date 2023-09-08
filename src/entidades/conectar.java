/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author fojos
 */
public class conectar {
  
  private static Connection conectador;
   
public static void conectorcin(){
try {
       Class.forName("org.mariadb.jdbc.Driver");
        conectador =DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad_punta","root","");
       
       }catch(ClassNotFoundException con){
          JOptionPane.showMessageDialog(null,"error porque pinto"+con.getMessage());
     
       
       } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"error al conectar"+ex.getMessage());
    }
    


}

public static void cargaralumno(alumno alm){

String sql ="INSERT INTO alumno(DNI, nombre, apellido, nacimiento, estado) VALUES (?,?,?,?,?)";
try{
PreparedStatement ps = conectador.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
ps.setInt(1, alm.getDni());
ps.setString(2, alm.getNombre());
ps.setString(3,alm.getApellido());
ps.setDate(4, Date.valueOf(alm.getNacimiento()));
ps.setBoolean(5, alm.getEstado());

ps.executeUpdate();

ResultSet answer=ps.getGeneratedKeys();

if(answer.next()){
  alm.setIdalumno(answer.getInt(1));
    System.out.println("funko");

}else{
    System.out.println("no funko");

}



}catch(SQLException ex){
  JOptionPane.showMessageDialog(null,"otro error de no se que"+ex.getMessage());
}



}
public static void insertaMaterias(materia yupi){
String cadena = "INSERT INTO materia( nombre , año, estado) VALUES (?,?,?)";
try{
PreparedStatement datin = conectador.prepareStatement(cadena,Statement.RETURN_GENERATED_KEYS);
datin.setString(1,yupi.getNombre());
datin.setDate(2,Date.valueOf(yupi.getAño()));
datin.setBoolean(3, yupi.getEstado());

datin.executeUpdate();



}catch(SQLException ex){
JOptionPane.showMessageDialog(null,"la cagaste fatal"+ex.getMessage());
}


}

public static void materialumnos(inscripcion fuse){
    String sql="INSERT INTO `inscripcion`(`nota`, `idalumno`, `idmateria`) VALUES (?,?,?)";
   try{
    PreparedStatement datito = conectador.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
    datito.setInt(1,fuse.getNota());
    datito.setInt(2,fuse.getAlumno());
    datito.setInt(3,fuse.getMateria());
   
    
    
    
    
   datito.executeUpdate();
   
   }catch(SQLException x){
   JOptionPane.showMessageDialog(null,"seguis cagandola como un campeon"+x.getMessage());
   }

}
}
