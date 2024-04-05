/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author LabSispc17
 */
public class Cuadrado {
    
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    public void calcularArea(){
        int area = lado*lado;
        System.out.println("El area del cuadrado es: "+area);
    }
    
    public void calcularPerimetro(){
        int perimetro = lado*4;
        System.out.println("El perimetro del cuadrado es: "+perimetro);
    }
    
}
