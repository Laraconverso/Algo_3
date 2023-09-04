import java.util.ArrayList;

public class ListaDuplicanteHerencia<T> extends ArrayList<T>{

    @Override
    public boolean add(T x){
        super.add(x);
        super.add(x);
        return true;
    }

    //con la herencia es mas facil obtener comportamiento sorpresivo, lo cual es malo.

}
