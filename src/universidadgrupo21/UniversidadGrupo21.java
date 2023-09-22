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
import universidadgrupo21.entidades.Materia;
import universidadgrupo21.accesoaDatos.MateriaData;
import java.util.ArrayList;
import universidadgrupo21.accesoaDatos.InscripcionData;
import universidadgrupo21.entidades.Inscripcion;
import view.GestionUni;


/**
 *
 * @author Admin
 */
public class UniversidadGrupo21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     GestionUni tuni =  new GestionUni();
     tuni.setVisible(true);

    
// ojala que este funcione por dios fdsgfeaeavear   
//       Alumno jacinto = new Alumno(4,723456724, " Francisca Jacinto", "Fransuá", LocalDate.of(1979, Month.JUNE, 12), true);
        // AlumnoData alu = new AlumnoData();
        ///Materia carpinteria =new Materia("carpinteria", 3, true);
        //  MateriaData mat=new MateriaData();
        //mat.cargarMaterias(carpinteria);
////       alu.guardarAlumno(jacinto);
//       alu.modificarAlumno(jacinto);
        //alu.eliminarAlumno(4);
        //Alumno chanta = alu.buscador(1);
        //System.out.println("se encontro"+chanta);
        /* for(Alumno mamotreto:alu.listador()){
        System.out.println(mamotreto.getDni());
        System.out.println(mamotreto.getApellido());
        System.out.println(mamotreto.getNombre());
        System.out.println(mamotreto.getNacimiento());
    }*/
//    Materia aldope =mat.buscadorex(5);
//        System.out.println("materia encontrada"+aldope);
        /* for(Materia queseyo:mat.listadorex()){
        System.out.println(queseyo.getNombre());
        System.out.println(queseyo.getAño());
        System.out.println(queseyo.getEstado());
    
    
    
    }*/

//        AlumnoData ad = new AlumnoData();
//        MateriaData md = new MateriaData();
//        InscripcionData id = new InscripcionData();
//
//        Alumno alu = ad.buscador(2);
//        Materia mat = md.buscadorex(4);
//        Inscripcion ins = new Inscripcion(7, alu, mat);

        // id.guardarInscripcion(ins);
        //id.actualizarNota(2, 4, 10);
        //id.borrarInscripcionMateriaAlumno(2, 4);
        /* for(Inscripcion Inscripcion:id.ObtenerInscripciones()){
        System.out.println("id: "+Inscripcion.getIdinscripcion());
        System.out.println("Apellido: "+Inscripcion.getAlumnox().getApellido());
        System.out.println("Materia: "+Inscripcion.getMateriax().getNombre());
        System.out.println("----------------------");
         */
//   for(Inscripcion Inscripcion:id.ObtenerInscripcionesPorAlumno(1)){
//        System.out.println("id: "+Inscripcion.getAlumnox().getIdalumno());
//        System.out.println("Apellido: "+Inscripcion.getAlumnox().getApellido());
//        System.out.println("Materia: "+Inscripcion.getMateriax().getNombre());
//        System.out.println("----------------------");
//    }
//   for (Materia matins : id.obtenerMateriasNoCursadas(1)) {
//
//            System.out.println("" + matins.getNombre());
//            System.out.println("" + matins.getIdMateria());
//            System.out.println("" + matins.getAño());
////   }
//        for (Alumno al : id.obtenerAlumnosXMateria(4)) {
//            System.out.println("" + al.getIdalumno());
//            System.out.println("" + al.getDni());
//            System.out.println("" + al.getApellido());
//            System.out.println("" + al.getNombre());
//            System.out.println("" + al.getNacimiento());
//            System.out.println("" + al.getEstado());
//        }
//
//    }

//}
    }
}