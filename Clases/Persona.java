/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author LabSispc17
 */
public class Persona {
    
    private LocalDate fecha;
    private String nombre;

    public Persona() {
    }

    public Persona(LocalDate fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "fecha=" + fecha + ", nombre=" + nombre + '}';
    }
     
    public void calcularEdad (){ 
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        int dias = periodo.getDays();
        int meses = periodo.getMonths();
        int años = periodo.getYears();
        
        System.out.println(nombre+" tiene " +años+ " años, " +meses+ " meses, " +dias+ " dias.");  
    }
}
