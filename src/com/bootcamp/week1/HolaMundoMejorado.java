package com.bootcamp.week1;


public class HolaMundoMejorado {

    public static void main (String [] args) {

        //Declaración de variables
        String nombre= "Ana";
        int edad  = 25;
        double altura = 1.68;
        boolean esActivo = true;

        //Concatenación de strings con +
        String mensaje1 = "Me llamo " + nombre + ", tengo " + edad + " años, mido " + altura + "m y estoy " + (esActivo ? "activo" : "inactivo");

        System.out.println(mensaje1);

        //Usando String.format()

        String mensaje2 = String.format(
                "Me llamo %s, tengo %d años, mido %.2f m y estoy %s.", nombre, edad, altura, esActivo  ? "activo" : "inactivo"
        );
        System.out.println(mensaje2);

    }

}