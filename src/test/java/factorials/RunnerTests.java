package factorials;


import org.junit.jupiter.api.Test;

import factorials.Runner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunnerTests {

    @Test
    public void output1() {

        Runner rn = new Runner();
            assertEquals(5,rn.reverseFactorial(120));

    }

}


