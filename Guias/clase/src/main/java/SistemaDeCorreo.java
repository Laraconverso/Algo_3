
class SistemaDeCorreo {
    public boolean enviar(Correo correo, Directorio d) {
        String direccionDestino = correo.getDireccionDestino();
        Casilla destino = d.getCasilla(direccionDestino);
        boolean recibido = destino.recibirCorreo(correo);
        return recibido;
    }
}


class Correo{
    public String direccionDestino;

    public String getDireccionDestino() {
        return direccionDestino;
    }
}

class Directorio{
    Casilla casilla;

    public Casilla getCasilla(String direccionDestino) {
        return casilla;
    }
}
class Casilla{
    boolean recibirCorreo(Correo correo){
        return true;
    }

}