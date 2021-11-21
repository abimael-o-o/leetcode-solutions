import org.junit.Test;
import static org.junit.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void romanToInt() {
        RomanToInteger test = new RomanToInteger();
        assertEquals("MCMXCIV = 1994", 1994, test.romanToInt("MCMXCIV"));
        System.out.println("Passed: MCMXCIV = 1994");
    }
}