import java.io.*;
import java.util.List;

public class PersonaSerialize implements Serializable {
    public  int edad;
    public String nombre;

    transient List<Facultad> facultades;

    public PersonaSerialize(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public void serializar(OutputStream os) throws IOException {
        var bos = new ObjectOutputStream(os);
        bos.writeObject(this);
    }

    public static Persona deserializar(InputStream is) throws IOException, ClassNotFoundException {
        var bis = new ObjectInputStream(is);
        return (Persona)bis.readObject();
    }


}
