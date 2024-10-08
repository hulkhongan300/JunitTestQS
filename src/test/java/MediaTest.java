import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.Media;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaTest {
    Media media = new Media();

    @BeforeEach
    public void mediaBefore(){
        int i =media.media(968993894);
        System.out.println("O primeiro com o beforeEach 968993894 e média "+i);
    }
    @Test
    public void mediaTest(){
        int expeted = media.media(959595);
        assertEquals(expeted,7);
    }
}
