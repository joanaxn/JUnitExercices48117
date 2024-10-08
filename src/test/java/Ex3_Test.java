import org.example.Ex3_Area_Perim;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex3_Test {
    @Test
    public void testArea() {
        Ex3_Area_Perim areaR = new Ex3_Area_Perim();
        int area = areaR.area(3, 5);
        int testArea = 11;
        assertEquals(area, testArea);

    }

    @Test
    public void testPerim() {
        Ex3_Area_Perim perimR = new Ex3_Area_Perim();
        int perim = perimR.perimetro(5, 10);
        int testPerimR = 20;
        assertEquals(perim, testPerimR);
    }


    @Test
    public void testTriangle(){
        Ex3_Area_Perim triangle = new Ex3_Area_Perim();
        int triangle3 = triangle.isTriangle(4,2,1);
        int testTriangle = 1;
        assertEquals(triangle3, testTriangle);
    }
}


