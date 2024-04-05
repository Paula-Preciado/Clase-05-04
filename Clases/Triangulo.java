/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author LabSispc17
 */
public class Triangulo {
    private int lado1, lado2;

    public Triangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Triangulo() {
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    public void calcularHipotenusaPeritro(){
        double hipotenusa = Math.sqrt(Math.pow(lado1, 2)+Math.pow(lado2, 2));
        System.out.println("El valor de la hipotenusa es: "+hipotenusa);
        
        double perimetro = lado1+lado2+hipotenusa;
        System.out.println("El perimetro del triangulo es: "+perimetro);
        
    }
    
        public void calcularArea(){
        int area = (lado1*lado2)/2;
        
        System.out.println("El area del triangulo es: "+area);
    }
    
}
