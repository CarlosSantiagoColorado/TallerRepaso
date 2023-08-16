package model;

public class Persona {

    private String nombre;
    private String apellido;
    private String Identificacion;

    public Persona(){

    }

    public Persona(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        Identificacion = identificacion;
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

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", Identificacion='" + Identificacion + '\'' +
                '}';
    }
}
