import java.util.Arrays;
import java.util.List;

public class ej4 {

    void function(){
        List<Integer> lista = Arrays.asList(-81,64,0,-4,100, 49,-25,9,1);
        System.out.println(lista.stream().filter(x-> x>=0).map(Math::sqrt).reduce(0.0, (x,y)->x+y));
    }

}
