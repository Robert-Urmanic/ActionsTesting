import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testSum(){
        Main main = new Main();
        assertEquals(6,main.sum(2,5));
    }
}
