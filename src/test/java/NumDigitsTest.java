import org.example.NumDigits;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumDigitsTest {

    private NumDigits digits;

    @BeforeEach
    public void setUp() {
        digits = new NumDigits();
    }

    @Test
    public void testMediaDosDigitos() {
        double media = digits.digits(12345);
        double expectedMedia = 2.0;
        assertEquals(expectedMedia, media);
    }
}