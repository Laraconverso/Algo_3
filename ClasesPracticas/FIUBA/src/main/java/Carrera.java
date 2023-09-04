import java.util.ArrayList;

public class Carrera {

    private String nombre;

    private ArrayList<Materia> materiasObligatorias;

    private ArrayList<Materia> materiasElectivas;

    private Integer creditosMin;


    public Carrera(String nombre) {
        this.nombre = nombre;
        materiasElectivas = new ArrayList<>();
        materiasObligatorias = new ArrayList<>();
    }
}
