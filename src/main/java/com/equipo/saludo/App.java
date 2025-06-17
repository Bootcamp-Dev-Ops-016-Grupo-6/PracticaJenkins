package com.equipo.saludo;
import java.util.logging.Logger;


class App {
    public static String saludar(String nombre) {
        return "¡Hola, " + nombre + "!";
    }

    public static void main(String[] args) {
        Logger.getLogger(App.class.getName()).info(saludar("DevOps"));
    }
}