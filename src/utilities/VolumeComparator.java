package utilities;

import shapes.Shape3D;

import java.util.Comparator;

public class VolumeComparator implements Comparator<Shape3D> {
    @Override
    public int compare(Shape3D s1, Shape3D s2) {
        return Double.compare(s1.getVolume(), s2.getVolume());
    }
}