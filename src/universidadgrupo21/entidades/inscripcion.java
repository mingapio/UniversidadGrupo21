/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author fojos
 */
public class inscripcion {
    private int idinscripcion;   
    private int nota;
    private  int alumno ;
    private int materia;
    
    public inscripcion (){}

    public inscripcion(int nota, int alumno, int materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getAlumno() {
        return alumno;
    }

    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }

    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
    }
    
    
    
}
