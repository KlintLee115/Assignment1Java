package shapes;

public class PentagonalPrism extends Shape3D {
    private final double edgeLength;

    public PentagonalPrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    @Override
    public double getBaseArea() {
        // Area of a regular pentagon: (5/4) * edgeLength^2 / tan(π/5)
        return (5.0 / 4.0) * edgeLength * edgeLength / Math.tan(Math.PI / 5);
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }

    @Override
    public String toString() {
        return "PentagonalPrism (height: " + height + ", edge length: " + edgeLength + ")";
    }
}
