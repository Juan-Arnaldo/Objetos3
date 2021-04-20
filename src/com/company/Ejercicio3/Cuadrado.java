package com.company.Ejercicio3;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(String color, double lado){
        super(color);
        this.lado=lado;

    }

    public double getArea() {
        return Math.pow(lado,2);
    }

    public double getPerimetro() {
        return lado*4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLado = " + lado +
                "\nArea = " + getArea() +
                "\nPerimetro = " + getPerimetro();
    }
}
