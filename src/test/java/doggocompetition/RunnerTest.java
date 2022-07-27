package doggocompetition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {

    @Test
    public void removedOneEntry() {
        Runner.Competition comp = new Runner.Competition();
        assertEquals(99, comp.position(50).size());
    }

    @Test
    public void didNotRemoveOneEntryIfOverRange() {
        Runner.Competition comp = new Runner.Competition();
        assertEquals(100, comp.position(101).size());
    }

    @Test
    public void didNotRemoveOneEntryIfUnderRange() {
        Runner.Competition comp = new Runner.Competition();
        assertEquals(100, comp.position(0).size());
    }
}