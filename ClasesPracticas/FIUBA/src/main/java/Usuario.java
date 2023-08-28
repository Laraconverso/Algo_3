import java.util.ArrayList;

public class Usuario {

    public String nombre;

    public ArrayList<Materia> materiasAprobadas;

    public ArrayList<Carrera> carreras;

    public Usuario(String nombre) {
        this.nombre = nombre;
        materiasAprobadas = new ArrayList<>();
        carreras = new ArrayList<>();
    }
}
