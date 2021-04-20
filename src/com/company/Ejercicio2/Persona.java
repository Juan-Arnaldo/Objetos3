package Ejercicio2;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;

    public Persona (String dni, String nombre, String apellido, String direccion, String correo){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nDireccion: " + direccion +"\nCorreo: " + correo;
    }
}
