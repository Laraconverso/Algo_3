import org.junit.Test;

import static org.junit.Assert.*;

public class Rot13Test {

    @Test
    public void test1() {
        //seccion 1: arrange
        String cadena = "a";
        String esperada = "n";

        //seccion 2: act
        String resultado = Rot13.cifrar(cadena);

        //seccion 3: assert
        assertEquals(esperada, resultado);
    }

    @Test
    public void testNoLetras() {
        //seccion 1: arrange
        String cadena = " ";
        String esperada = " ";

        //seccion 2: act
        String resultado = Rot13.cifrar(cadena);

        //seccion 3: assert
        assertEquals(esperada, resultado);
    }

}