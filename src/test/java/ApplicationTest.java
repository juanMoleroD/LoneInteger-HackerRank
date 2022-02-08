import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    Application testApp = new Application();
    List<Integer> testList = List.of(1,2,3,1,2);

    @Test
    void appCanFindMismatch() {
        assertEquals(3, testApp.lonelyinteger(testList));

    }
}