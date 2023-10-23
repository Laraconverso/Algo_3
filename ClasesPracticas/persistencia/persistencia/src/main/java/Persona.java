import java.io.*;

public class Persona {
    public  int edad;
    public String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void serializar(OutputStream os) throws IOException {
        //para simplificar los primeros 8 bits son la edad sin signo
        var bos = new ObjectOutputStream(os);
        bos.writeByte(edad);
        bos.writeShort(nombre.length()); //"Pepe" -> 4 (short 16 bits)
        bos.writeChars(nombre);

    }

    public static Persona deserializar(InputStream is) throws IOException {
        var bis = new ObjectInputStream(is);
        var edad = bis.readByte();
        var longCadena = bis.readShort();
        var nombre = "";
        for(int i =0;i<longCadena;i++){
            nombre = nombre + bis.readChar();
        }
        return new Persona(edad, nombre);
    }
}
