package solid.ocp;

public class Square  implements solid.ocp.Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
