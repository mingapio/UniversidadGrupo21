/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo21.entidades;

/**
 *
 * @author fojos
 */
public class Inscripcion {
    private int idinscripcion;   
    private int nota;
    private  Alumno alumnox ;
    private Materia materiax;
    
    public Inscripcion (){}

    public Inscripcion(int nota, Alumno alumnox, Materia materiax) {
        this.nota = nota;
        this.alumnox = alumnox;
        this.materiax = materiax;
    }

    public Inscripcion(int idinscripcion, int nota, Alumno alumnox, Materia materiax) {
        this.idinscripcion = idinscripcion;
        this.nota = nota;
        this.alumnox = alumnox;
        this.materiax = materiax;
    }

    
    public int getIdinscripcion() {
        return idinscripcion;
    }

    public void setIdinscripcion(int idinscripcion) {
        this.idinscripcion = idinscripcion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno getAlumnox() {
        return alumnox;
    }

    public void setAlumnox(Alumno alumnox) {
        this.alumnox = alumnox;
    }

    public Materia getMateriax() {
        return materiax;
    }

    public void setMateriax(Materia materiax) {
        this.materiax = materiax;
    }

    @Override
    public String toString() {
        return "inscripcion{" + "idinscripcion=" + idinscripcion + ", nota=" + nota + ", alumnox=" + alumnox + ", materiax=" + materiax + '}';
    }

   
    
    
}
