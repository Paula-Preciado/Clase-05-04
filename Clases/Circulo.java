/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author LabSispc17
 */
public class Circulo {
    
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    public void calcularArea(){
        double pi = Math.PI;
        
        double area = pi*Math.pow(radio,2);
        System.out.println("El area del circulo es: "+area);
    }
    
    public void calcularPerimetro(){
        double pi = Math.PI;
        
        double perimetro = 2*pi*radio;
        System.out.println("El perimetro del circulo es: "+perimetro);
    }
}
