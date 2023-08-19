package model;

public class ClienteNatural extends Cliente{

    private String email;
    private String fechaNacimiento;

    public ClienteNatural() {
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {

        return "clienteNatural{" +
                "Email='" + email + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                "} " + super.toString();
    }
}
