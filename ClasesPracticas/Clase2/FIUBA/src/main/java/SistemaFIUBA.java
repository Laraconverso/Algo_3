
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SistemaFIUBA {

    //Usuario[] usuarios; ///-> los arreglos son dinamicos y el tamaño es estatico.
    //es recomendable usar TDAs.

    //es buena oractica indicar si es publico o privado.
    //public ArrayList<Usuario> usuarios;

    private Map<Integer, Usuario> usuarios = new HashMap<>();
    private Map<String, Materia> materias = new HashMap<>();
    private Map<Integer,Carrera> carreras =new HashMap<>();

    public SistemaFIUBA() {
    }



}