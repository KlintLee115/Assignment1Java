package utilities;

import shapes.Shape3D;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {

    public static void MergeSort(Shape3D[] array, Comparator<Shape3D> comparator) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        Shape3D[] left = Arrays.copyOfRange(array, 0, mid);
        Shape3D[] right = Arrays.copyOfRange(array, mid, array.length);

        MergeSort(left, comparator);
        MergeSort(right, comparator);

        Merge(array, left, right, comparator);
    }

    private static void Merge(Shape3D[] array, Shape3D[] left, Shape3D[] right, Comparator<Shape3D> comparator) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i], right[j]) > 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}