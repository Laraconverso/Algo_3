import java.util.ArrayList;

public class Carrera {

    public String nombre;

    public ArrayList<Materia> materiasObligatorias;

    public ArrayList<Materia> materiasElectivas;

    public Integer creditosMin;


    public Carrera(String nombre) {
        this.nombre = nombre;
        materiasElectivas = new ArrayList<>();
        materiasObligatorias = new ArrayList<>();
    }
}
