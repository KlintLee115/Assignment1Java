package shapes;

public abstract class Shape3D implements Comparable<Shape3D> {
    protected double height;

    public Shape3D(double height) {
        this.height = height;
    }

    // Abstract methods to calculate base area and volume.
    public abstract double getBaseArea();
    public abstract double getVolume();

    // compareTo method to compare shapes based on height.
    @Override
    public int compareTo(Shape3D otherShape) {
        return Double.compare(this.height, otherShape.height);
    }
}
