/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.time.LocalDate;

/**
 *
 * @author fojos
 */
public class materia {
    private int idMateria;
    private String nombre;
    private LocalDate año;
    private boolean estado;

   public materia(){}

    public materia(int idMateria, String nombre, LocalDate año, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public materia(String nombre, LocalDate año, boolean estado) {
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getAño() {
        return año;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "materia{" + "nombre=" + nombre + ", a\u00f1o=" + año + ", estado=" + estado + '}';
    }
    
    
}
