package utilities;

import shapes.Shape3D;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {

    public static void MergeSort(Comparable[] array, Comparator comparator) {

        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        Comparable[] left = Arrays.copyOfRange(array, 0, mid);
        Comparable[] right = Arrays.copyOfRange(array, mid, array.length);

        MergeSort(left, comparator);
        MergeSort(right, comparator);
        Merge(array, left, right, comparator);
    }

    private static void Merge(Comparable[] array, Comparable[] left, Comparable[] right, Comparator comparator) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i], right[j]) <= 0) {
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

    public static void BubbleSort(Comparable[] array, Comparator comparator) {
    }

    public static void InsertionSort(Comparable[] array, Comparator comparator) {
    }

    public static void SelectionSort(Comparable[] array, Comparator comparator) {
    }

    public static void QuickSort(Comparable[] array, Comparator comparator) {
    }

    public static void OtherSort(Comparable[] array, Comparator comparator) {
    }
}