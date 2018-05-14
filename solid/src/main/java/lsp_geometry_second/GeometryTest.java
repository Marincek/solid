package lsp_geometry_second;

import junit.framework.TestCase;
import org.junit.Test;

class GeometryTest extends TestCase {


    @Test
    public void testRectangleArea() {
        Shape rectangle = new Rectangle(5, 4);

        assertTrue("Area is " + rectangle.getArea(), rectangle.getArea() == 20);
    }

    @Test
    public void testSquareArea() {
        Shape square = new Square(5);

        assertTrue("Area is " + square.getArea(), square.getArea() == 25);
    }

}
