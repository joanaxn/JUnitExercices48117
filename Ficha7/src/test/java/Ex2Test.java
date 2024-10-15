import org.example.Ex2;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex2Test {

    Ex2 ex2 = new Ex2();

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    void isOddTest(int num) {
        assertTrue(ex2.isPrime(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {32, 64, 4, 20, 30, 26})
    void testIsEven(int num) {
        assertTrue(ex2.isEven(num));
    }

    @ParameterizedTest
    @CsvSource(value={"23,23", "46,23", "115,23", "184,23", "207,23", "230,23"})
    void testIsMultiple(int num, int div) {
        assertTrue(ex2.isMultiple(num, div));
    }
}