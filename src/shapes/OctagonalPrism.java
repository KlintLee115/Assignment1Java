package shapes;

public class OctagonalPrism extends Shape3D {
    private final double edgeLength;

    public OctagonalPrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    @Override
    public double getBaseArea() {
        // Area of a regular octagon: 2 * (1 + sqrt(2)) * edgeLength^2
        return 2 * (1 + Math.sqrt(2)) * edgeLength * edgeLength;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }
}

