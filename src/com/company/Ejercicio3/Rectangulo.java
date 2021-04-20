package com.company.Ejercicio3;

public class Rectangulo extends Figura {
    private double largo;
    private double ancho;


    public Rectangulo(String color, double largo, double ancho) {
        super(color);
        this.largo=largo;
        this.ancho=ancho;
    }

    @Override
    public double getArea() {
        return ancho*largo;
    }

    @Override
    public double getPerimetro() {
        return largo*2 + ancho *2;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nLargo = " + largo +
                "\nAncho = " + ancho +
                "\nArea = " + getArea() +
                "\nPerimetro = " + getPerimetro();
    }
}
