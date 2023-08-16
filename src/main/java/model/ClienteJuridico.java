package model;

public class ClienteJuridico {
    private String nit;

    public ClienteJuridico(String nit) {
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "nit='" + nit + '\'' +
                '}';
    }
}
