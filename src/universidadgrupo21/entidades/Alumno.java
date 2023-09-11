/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo21.entidades;
import java.time.LocalDate;
/**
 *
 * @author fojos
 */
public class Alumno {
    private int idalumno;
    private int dni;
    private String nombre, apellido;
    private LocalDate nacimiento;
    private boolean estado;

    public Alumno(){}
    public Alumno(int dni, String nombre, String apellido, LocalDate nacimiento, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.estado = estado;
    }

    public Alumno(int idalumno, int dni, String nombre, String apellido, LocalDate nacimiento, boolean estado) {
        this.idalumno = idalumno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.estado = estado;
    }
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

   
    @Override
    public String toString() {
        return "alumno{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", estado=" + estado + '}';
    }
    
    
    
}
