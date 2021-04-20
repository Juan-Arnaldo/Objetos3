package com.company;

import com.company.Ejercicio1.Cilindro;
import com.company.Ejercicio1.Circulo1;
import com.company.Ejercicio3.Circulo;
import com.company.Ejercicio3.Cuadrado;
import com.company.Ejercicio3.Rectangulo;

public class Main {

    public static void main(String[] args) {
	    Rectangulo rect = new Rectangulo("amarillo",15,20);
	    rect.getPerimetro();
	    rect.getArea();
	    System.out.println("------------Rectangulo:----------");
		System.out.println(rect.toString());
		Circulo circ = new Circulo("verde",4);
		circ.getArea();
		circ.getPerimetro();
		System.out.println("------------Circulo:----------");
		System.out.println(circ.toString());

		Cuadrado cuad = new Cuadrado("naranja",10,10);
		System.out.println("------------Cuadrado:----------");
		System.out.println(cuad.toString());

		Circulo1 circul1 = new Circulo1("verde",10);
		Cilindro cilin = new Cilindro("algo",4,10);
		System.out.println("------------Cilindro:----------");
		System.out.println(cilin.toString());

		Cilindro cilin2 = new Cilindro("Rojo",5,15);
		System.out.println("------------Cilindro 2:----------");
		System.out.println(cilin2.toString());


    }
}
