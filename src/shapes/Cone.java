package shapes;

public class Cone extends Shape3D
{
    private final double radius;

    public Cone(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * getBaseArea() * height;
    }
}
