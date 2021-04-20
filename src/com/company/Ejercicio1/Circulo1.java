package com.company.Ejercicio1;

public class Circulo1 {
    private double radio=1;
    private String color="Rojo";


    public Circulo1(String color, float radio) {
        this.color=color;
        this.radio=radio;
    }

    public Circulo1(float radio) {
        this.radio=radio;
    }

    public double getArea() {
        return Math.PI*(Math.pow(this.radio,2));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {

        return
                        "\nRadio = " + radio +
                        "\nColor = " + color +
                        "\nArea = " + getArea() + "\n";
    }
}
