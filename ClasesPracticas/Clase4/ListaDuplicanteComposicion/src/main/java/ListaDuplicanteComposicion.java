import java.util.ArrayList;

public class ListaDuplicanteComposicion<T> {

    private final ArrayList<T> elementos = new ArrayList<>();

    public void add (T x){
        elementos.add(x);
        elementos.add(x);
    }

    public T get(int i){
        return elementos.get(i);
    }


}
