package com.company.Ejercicio2;

public class Staff extends Persona{
    private double salario;
    private String turno;

    public Staff(String dni, String nombre, String apellido, String direccion, String correo, double salario, String turno){
        super(dni, nombre, apellido, direccion, correo);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double salarioAnual(Estudiante e){
        double total = 0;
        total += e.getCuotaMensual();
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario: " + salario + "\nTurno: " + turno + "\n\n";
    }
}
