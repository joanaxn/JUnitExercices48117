import org.example.ex3.CU;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CUTest {
    private CU cu;

    @BeforeEach
    public void setUp() {
        cu = new CU("Algoritmia e Programação", 3);
    }

    @Test
    public void TestInsertMarkCU() {
        cu.insertMarkCU(1, 8.5);
        assertEquals(8.5, cu.searchStudent(1));

        cu.insertMarkCU(3, 9.0);
        assertEquals(9.0, cu.searchStudent(3));

        cu.insertMarkCU(2, 14.0);
        assertEquals(14.0, cu.searchStudent(2));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 7.5, 7.5",
            "2, 9.0, 9.0",
            "3, 8.0, 8.0"
    })
    public void TestSearchStudent(int studentNum, double expectedMark) {
        cu.insertMarkCU(studentNum, expectedMark);
        assertEquals(expectedMark, cu.searchStudent(studentNum));
        assertNotEquals(100.0, cu.searchStudent(studentNum));
    }

    @ParameterizedTest
    @CsvSource({
            "7.0, 9.5, 8.0, 8.1667",
            "5.0, 10.0, 8.0, 7.6667",
            "9.0, 8.0, 10.0, 9.0"
    })
    public void TestAverageCU(double mark1, double mark2, double mark3, double expectedAverage) {
        cu.insertMarkCU(1, mark1);
        cu.insertMarkCU(2, mark2);
        cu.insertMarkCU(3, mark3);

        assertEquals(expectedAverage, cu.averageCU(), 0.0001);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 7.0, false",
            "2, 9.5, true",
            "3, 8.0, false"
    })
    public void TestIsApproved(int studentNum, double mark, boolean expectedApproval) {
        cu.insertMarkCU(studentNum, mark);
        assertEquals(expectedApproval, cu.isApproved(studentNum));
    }
}
