
import java.util.ArrayList;

public class SistemaFIUBA {

    //Usuario[] usuarios; ///-> los arreglos son dinamicos y el tamaño es estatico.
    //es recomendable usar TDAs.

    //es buena oractica indicar si es publico o privado.
    public ArrayList<Usuario> usuarios;
    public ArrayList<Materia> materias;

    public ArrayList<Carrera> carreras;

    public SistemaFIUBA() {
        ///usuarios = new Usuario[3]; //inicializao con arreglo de tamaño 3
        usuarios = new ArrayList<>();
        materias = new ArrayList<>();
        carreras = new ArrayList<>();
    }

    //hash map
    // o ArrayList

}