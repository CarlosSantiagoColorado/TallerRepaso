package org.example;

import model.ClienteNatural;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        validarHerencia();

    }

    private static void validarHerencia() {
        /*
         Cliente cliente = new Cliente();
        cliente.setNombre("Jacinto");
        cliente.setApellido("Sutamarchán");
        cliente.setIdentificacion("1234567890");
        cliente.setDireccion("El bronx");
        cliente.setTelefono("3188198242");
        System.out.println(cliente.toString());
         */
        ClienteNatural clienteN = new ClienteNatural();
        clienteN.setNombre("Kellyn");
        clienteN.setApellido("Teresa");
        clienteN.setIdentificacion("09876544321");
        clienteN.setDireccion("Debajo de un puente");
        clienteN.setEmail("notengo@gmail.com");
        clienteN.setTelefono("3006720160");
        clienteN.setFechaNacimiento("29 de Febrero");
        System.out.println(clienteN);


    }
}