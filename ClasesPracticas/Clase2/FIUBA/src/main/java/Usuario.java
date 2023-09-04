import java.util.ArrayList;

public class Usuario {

    private String nombre;

    private ArrayList<Materia> materiasAprobadas;

    private ArrayList<Carrera> carreras;

    public Usuario(String nombre) {
        this.nombre = nombre;
        materiasAprobadas = new ArrayList<>();
        carreras = new ArrayList<>();
    }
}
