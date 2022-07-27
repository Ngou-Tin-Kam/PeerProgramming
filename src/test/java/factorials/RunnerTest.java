package factorials;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunnerTest {

    @Test
    public void isFactorial() {
        Runner rn = new Runner();
            assertEquals(5, rn.reverseFactorial(120));
    }

    @Test
    public void notFactorial() {
        Runner rn = new Runner();
        assertEquals(-1, rn.reverseFactorial(150));
    }

}


