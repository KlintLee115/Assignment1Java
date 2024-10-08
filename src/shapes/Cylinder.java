package shapes;

public class Cylinder extends Shape3D
{
    private final double radius;

    public Cylinder(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder (height: " + height + ", radius: " + radius + ")";
    }
}
