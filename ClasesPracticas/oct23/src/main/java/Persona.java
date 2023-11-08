import java.io.*;
import java.util.List;

public class Persona implements Serializable {
    public short edad;
    public String nombre;

    public void serializar(OutputStream os) throws IOException {
        var bos = new ObjectOutputStream(os);
        bos.writeObject(this);
    }

    public static Persona deserializar(InputStream is) throws IOException, ClassNotFoundException {
        var bis = new ObjectInputStream(is);
        return (Persona) bis.readObject();
    }
}

class Facultad implements Serializable {
    List<Persona> alumnos;
}