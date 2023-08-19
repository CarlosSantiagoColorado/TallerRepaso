package model;

public class Cliente extends Persona{

    private String direccion;
    private String telefono;

    public Cliente(){

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                "} " + super.toString();
    }
}
