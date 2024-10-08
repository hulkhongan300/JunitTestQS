import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void somaTest(){
        int atualvalue = 2+2;
        Main main = new Main();
        int expectedValue = main.soma(2,2);
        assertEquals(atualvalue,expectedValue);
    }
}
