package com.company.Ejercicio3;

public abstract class Figura {
    private String color = "ninguno";


    public Figura(String color) {
        this.color = color;
    }
    public Figura(){

    }

    abstract double getPerimetro();

    abstract double getArea();


    @Override
    public String toString() {

        return "\nColor = " + color;
    }
}
