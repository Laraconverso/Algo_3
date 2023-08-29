package org.example;

//habria que revisar si cuumple con los principios y los distintos patrones de diseño.
public class App {
    public static void main(String[] args) {
        /* se podria hacer una clase de chat en donde se almacenen todos los usuarios y se almacenen el historial
        * del chat. */

        Usuario uno = new Usuario("Uno");
        Usuario dos = new Usuario("Dos");


        uno.enviarMensaje(dos, "Hola como estas?");




    }
}