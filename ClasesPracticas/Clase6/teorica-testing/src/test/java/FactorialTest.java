import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    private Calculadora calcu;

    @Before
    public void arrange(){
        calcu = new Calculadora();
    }

    @Test
    public void testValidoConCinco(){
        int n = 5; //arrange
        int factorial = calcu.calcularFactorial(n); //act
        assertEquals(factorial, 120); //assert
    }

}