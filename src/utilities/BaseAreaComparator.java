package utilities;

import shapes.Shape3D;

import java.util.Comparator;

public class BaseAreaComparator implements Comparator<Shape3D> {
    @Override
    public int compare(Shape3D s1, Shape3D s2) {
        return Double.compare(s1.getBaseArea(), s2.getBaseArea());
    }
}