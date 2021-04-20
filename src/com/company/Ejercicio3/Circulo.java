package com.company.Ejercicio3;

public class Circulo extends Figura{
    private double radio;


    public Circulo(String color, float radio) {
        super(color);
        this.radio=radio;
    }


    public double getArea() {
        return Math.PI*(Math.pow(this.radio,2));
    }

    public double getPerimetro() {
        return 2*(Math.PI)*this.radio;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nRadio = " + radio +
                "\nArea = " + getArea() +
                "\nPerimetro = " + getPerimetro();
    }
}
