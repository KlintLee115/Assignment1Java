package shapes;

public class TriangularPrism extends Shape3D
{
    private final double edgeLength;

    public TriangularPrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    public int getNumberOfSides() {
        return 3;
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
        return "TriangularPrism (height: " + height + ", edge length: " + edgeLength + ")";
    }
}
