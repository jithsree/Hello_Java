import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void testHello() {
        assertEquals("Hello World", hello());
    }

    public static String hello() {
        return "Hello World";
    }
}
