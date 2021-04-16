package com.company;

import com.company.Ejercicio2.Estudiante;
import com.company.Ejercicio2.Persona;
import com.company.Ejercicio2.Staff;

public class Main {

    public static void main(String[] args) {

        Persona[] arrayList = new Persona[8];
        double  total = 0;

        Estudiante e1 = new Estudiante("42782279", "Juan", "Arnaldo", "9 de julio 4243", "juanArnaldo@gmail.com", 2020, 3000, "programacion");
        Estudiante e2 = new Estudiante("12345678", "Agustin", "changote", "9 de julio 4123", "changote@gmail.com", 2019, 3500, "programacion");
        Estudiante e3 = new Estudiante("87654321", "Ian", "Acosta", "Independencia 1234", "eldiablo@gmail.com", 2019, 2000, "programacion");
        Estudiante e4 = new Estudiante("12348765", "Matias ", "Soria", "Por el puerto", "smatnic@gmail.com", 2021, 4000, "programacion");

        Staff s1 = new Staff("12873465", "Julian", "Schaab", "Olavarria", "juliProfe@gmail.com", 50000, "tarde");
        Staff s2 = new Staff("87126534", "Ricardo", "Martinez", "La Pampa", "Ricky@gmail.com", 60000, "Mañana");
        Staff s3 = new Staff("12345687", "Susana", "Guccione", "Colon 2342", "Susy@gmail.com", 100000, "Noche");
        Staff s4 = new Staff("87654312", "Pablo", "Mattera", "guido 1234", "Pablo@gmail.com", 25000, "Noche");

        arrayList[0] = e1;
        arrayList[1] = e2;
        arrayList[2] = e3;
        arrayList[3] = e4;
        arrayList[4] = s1;
        arrayList[5] = s2;
        arrayList[6] = s3;
        arrayList[7] = s4;

        for(Persona p : arrayList){
            System.out.println(p.toString());
            if(p instanceof Estudiante){
                total += ((Estudiante) p).getCuotaMensual();
            }
        }

        System.out.println("\nTotal de ingresos por la cuota mensula: " + total);

    }
}
