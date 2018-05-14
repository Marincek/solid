package lsp_geometry_second;

class Rectangle implements Shape {

    private int a;

    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return this.a * this.b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }
}
