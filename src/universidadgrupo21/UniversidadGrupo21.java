/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo21;

import java.time.LocalDate;
import java.time.Month;
import universidadgrupo21.accesoaDatos.AlumnoData;
import universidadgrupo21.entidades.Alumno;
import universidad.materia;
import universidadgrupo21.accesoaDatos.MateriaData;
/**
 *
 * @author Admin
 */
public class UniversidadGrupo21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Alumno jacinto = new Alumno(4,723456724, " Francisca Jacinto", "Fransuá", LocalDate.of(1979, Month.JUNE, 12), true);
       AlumnoData alu = new AlumnoData();
       materia carpinteria =new materia("carpinteria", 3, true);
       MateriaData mat=new MateriaData();
       mat.cargarMaterias(carpinteria);
////       alu.guardarAlumno(jacinto);
//       alu.modificarAlumno(jacinto);
        //alu.eliminarAlumno(4);
        
        
    }
    
}
