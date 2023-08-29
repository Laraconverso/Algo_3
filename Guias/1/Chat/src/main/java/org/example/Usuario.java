package org.example;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
   // private String numTel; o cualquier otra cosa que se quiera agregar al usuario

    //tipo array de stikcers
    private ArrayList<Mensaje> msjEnviados;
    private ArrayList<Mensaje> msjRecibidos;


    public Usuario(String nombre) {
        this.nombre = nombre;
        this.msjEnviados = new ArrayList<>();
        this.msjRecibidos = new ArrayList<>();
    }

    public void enviarMensaje(Usuario destinatario, String msj){
        Mensaje mensaje = new Mensaje(destinatario, this,msj);
        msjEnviados.add(mensaje);
        destinatario.recibirMsj(mensaje);
    }

    public void recibirMsj(Mensaje mensaje){
        msjRecibidos.add(mensaje);
    }




}
