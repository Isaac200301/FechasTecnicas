/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fechastrabajo;
import java.time.LocalDate;
/**
 *
 * @author Jose Luis GIl
 */
public class Persona {
    private String nombre;
    private LocalDate fechaGrado;
    private LocalDate fechaMatrimonio;
    private LocalDate fechaLoteria;
    private LocalDate fechaMuerte;
    private boolean estado;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, LocalDate fechaGrado, LocalDate fechaMatrimonio, LocalDate fechaLoteria, LocalDate fechaMuerte, boolean estado, LocalDate fechaNacimiento ){
        this.nombre= nombre;
        this.fechaGrado= fechaGrado;
        this.fechaMatrimonio=fechaMatrimonio;
        this.fechaLoteria=fechaLoteria;
        this.fechaMuerte=fechaMuerte;
        this.estado=estado;
        this.fechaNacimiento=fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaGrado() {
        return fechaGrado;
    }

    public void setFechaGrado(LocalDate fechaGrado) {
        this.fechaGrado = fechaGrado;
    }

    public LocalDate getFechaMatrimonio() {
        return fechaMatrimonio;
    }

    public void setFechaMatrimonio(LocalDate fechaMatrimonio) {
        this.fechaMatrimonio = fechaMatrimonio;
    }

    public LocalDate getFechaLoteria() {
        return fechaLoteria;
    }

    public void setFechaLoteria(LocalDate fechaLoteria) {
        this.fechaLoteria = fechaLoteria;
    }

    public LocalDate getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(LocalDate fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
