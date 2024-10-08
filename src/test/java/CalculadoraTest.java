import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSoma() {
        Calculadora calculo = new Calculadora();
        int soma = calculo.soma(2,5);
        int testSoma = 7;
        assertEquals (soma, testSoma);
        int comp1=3, larg1 = 5;
        int comp2=5, larg2 = 8;
        int comp3=2, larg3 = 4;
        int area1 = calculo.area(comp1,larg1);
        int perimnrto1 = calculo.perimetro(comp1,larg1);
        int area2 = calculo.area(comp2,larg2);
        int perimnrto2 = calculo.perimetro(comp2,larg2);
        int area3 = calculo.area(comp3,larg3);
        int perimnrto3 = calculo.perimetro(comp3,larg3);
        assertEquals(area1,15);
        assertEquals(area2,40);
        assertEquals(area3,8);
        assertEquals(perimnrto1,16);

        assertEquals(perimnrto2,26);

        assertEquals(perimnrto3,12);

        int isTriangule = calculo.isTriangle(2,3,4);
        assertEquals(isTriangule,1);
    }
}
