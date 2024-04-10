package ie.atu.week10;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Running CounterTest")
class CounterTest {
    Counter myCount;


    @BeforeAll
    static void init()
    {
        System.out.println("Beginning of all tests");
    }
    @BeforeEach
    void setUp() {
        myCount = new Counter();
    }



    @Test
    @DisplayName("Some details here for testIncrement")
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
        assertThrows(IllegalArgumentException.class, () -> { new Counter(4);});
    }

    @Test
    void testConstructorFailMessage()
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
    @AfterAll
    static void finished()
    {
        System.out.println("End of all tests");
    }
}