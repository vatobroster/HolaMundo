package com.acme;

import java.util.Scanner;

public class Mensaje {

    public String solicitarDatos(String msg){
        System.out.println(msg);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();

    }

    public void saludar(String nombre) {
        System.out.printf("Hola %s, bienvenido a Java \n", nombre);

    }
}
