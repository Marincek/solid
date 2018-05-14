package lsp_geometry_second;

class Square implements Shape {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
