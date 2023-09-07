import org.junit.Test;
import org.junit.Before;

public class TaTeTiTest {

    //IMPORTANTE: hacer 3 pasos para las pruebas:
    //Arrange: inicializar variables, cargar objetos etc.
    //Act: invocar el metodo o los metodos que quiero probar.
    //Assert: Ver el resultado del act.

    private TaTeTi juego;

    //arrange
    @Before
    public void arrange(){
         juego = new TaTeTi(3);
    }

    //act
    @Test
    public void prueba(){
        //probar los metodos del tateti
    }
}