package lsp_geometry;

import junit.framework.TestCase;
import org.junit.Test;

public class GeometryTest extends TestCase {


    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle();
        rectangle.setA(5);
        rectangle.setB(4);

        assertTrue("Area is " + rectangle.getArea(), rectangle.getArea() == 20);
    }

    @Test
    public void testSquareArea() {
        Rectangle rectangle = new Square();
        rectangle.setA(5);
        rectangle.setB(3);
        assertTrue("Area is " + rectangle.getArea(), rectangle.getArea() == 15);
    }

}
