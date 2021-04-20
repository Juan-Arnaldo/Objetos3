package Ejercicio3;

public class Cuadrado extends Rectangulo{

    public Cuadrado(String color, double ancho,double largo){
        super(color,ancho,largo);

    }


    public double getArea() {
        return super.getAncho()*super.getLargo();
    }

    public double getPerimetro() {
        return super.getLargo()*2 + super.getAncho() *2;
    }

}
