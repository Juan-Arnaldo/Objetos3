package com.company.Ejercicio1;

public class Cilindro extends Circulo1 {
    private double altura=1;

    public Cilindro(String color, float radio, double altura) {
        super(color,radio);
        this.altura=altura;
    }

    public double getVolumen(){
        return Math.PI*Math.pow(super.getRadio(),2)*altura;
    }

    @Override
    public double getArea(){
        return 2*Math.PI*getRadio()*getAltura() + 2*super.getArea();
    }

    public double getAltura() {
        return altura;
    }

    public String toString() {

        return "Cilindro: "+super.toString()+" \nAltura = "+getAltura() + "\n";
    }
}
