import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void testHello() {
        assertEquals("hello, world!", hello());
    }

    public static String hello() {
        return "hello, world!";
    }
}
