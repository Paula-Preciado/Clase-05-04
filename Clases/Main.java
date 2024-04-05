/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author LabSispc17
 */
public class Main {
    public static void main(String[] args){
        
        Persona persona = new Persona(LocalDate.of(2002, 8, 26), "Paula");
        persona.calcularEdad();
       
        Cuadrado cuadrado  = new Cuadrado(5);
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        
        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        
        Triangulo triangulo = new Triangulo(5, 7);
        triangulo.calcularHipotenusaPeritro();
        triangulo.calcularArea();
    }
      
}
