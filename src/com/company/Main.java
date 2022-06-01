package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a la practica de Git");

        Gato gato = new Gato();
        Perro perro = new Perro();
        Menu menu = new Menu();
        menu.menuCreacion();
        menu.menuReportes();


    }
}