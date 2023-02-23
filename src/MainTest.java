import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testUserSeeSerie(){
        // Given

        Serie serie = new Serie("utopia");
        SerieProxy serieProxy = new SerieProxy(serie);

        User user01 = new User("Martin",1, serieProxy);
        String expectedMessage = "www.utopia.com";
        // When
        String obtainedMessage = user01.seeSerie("utopia");

        user01.seeSerie("utopia");


        // Then
        Assertions.assertEquals(expectedMessage,obtainedMessage);

    }


}