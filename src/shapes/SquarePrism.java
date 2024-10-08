package shapes;

public class SquarePrism extends Shape3D
{
    private final double edgeLength;

    public SquarePrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public double getBaseArea() {
        double apothem = edgeLength / (2 * Math.tan(Math.PI / getNumberOfSides()));
        return 0.5 * getNumberOfSides() * edgeLength * apothem;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }

    @Override
    public String toString() {
        return "SquarePrism (height: " + height + ", edge length: " + edgeLength + ")";
    }
}
