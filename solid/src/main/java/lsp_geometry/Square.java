package lsp_geometry;

class Square extends Rectangle {

    @Override
    public void setA(int a) {
        super.setA(a);
        super.setB(a);
    }

    @Override
    public void setB(int b) {
        super.setB(b);
        super.setA(b);
    }
}
