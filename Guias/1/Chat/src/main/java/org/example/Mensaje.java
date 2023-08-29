package org.example;

import java.util.Date;

public class Mensaje {

    private Usuario destinatario;
    private Usuario remitente;
    private String texto;
    private Date fechaEnvio;

    public Mensaje(Usuario destinatario, Usuario remitente, String texto) {
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.texto = texto;
        this.fechaEnvio = new Date(); //la fecha del momento en el que se crea.
    }


}
