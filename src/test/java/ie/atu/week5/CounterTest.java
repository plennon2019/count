package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    Counter myCount;

    @BeforeEach
    void setUp() {
        myCount = new Counter();
    }

    @Test
    void testIncrement()
    {
        assertEquals(1, myCount.increment());
    }

    @Test
    void testDecrement()
    {
        assertEquals(-1, myCount.decrement());
    }

    @Test
    void testConstructorFail()
    {
      Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { new Counter(4);});
      assertEquals("This is not a valid number", exMessage.getMessage());
    }

    //@Test
    void testConstructorSuccess()
    {
        Counter newCounter = new Counter(6);
        assertEquals(6, newCounter.getCount());
    }

    @AfterEach
    void tearDown() {
    }
}