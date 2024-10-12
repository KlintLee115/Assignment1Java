package appDomain;

import shapes.Shape3D;
import utilities.BaseAreaComparator;
import utilities.ShapesFileReader;
import utilities.SortingAlgorithms;
import utilities.VolumeComparator;

import java.util.Comparator;

public class AppDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // refer to demo001 BasicFileIO.java for a simple example on how to
        // read data from a text file

        // refer to demo01 Test.java for an example on how to parse command
        // line arguments and benchmarking tests

        // refer to demo02 Student.java for comparable implementation, and
        // NameCompare.java or GradeCompare for comparator implementations

        // refer to demo02 KittySort.java on how to use a custom sorting
        // algorithm on a list of comparables to sort using either the
        // natural order (comparable) or other orders (comparators)

        // refer to demo03 OfficeManager.java on how to create specific
        // objects using reflection from a String
        if (args.length != 6) OutputError();

        if (!(args[0].equals("-f") && args[2].equals("-t") && args[4].equals("-s"))) OutputError();

        String fileName = args[1];

        // Read shapes from the file
        Shape3D[] shapes = ShapesFileReader.readShapesFromFile(fileName);

        // Print all shapes
        if (shapes != null) {
            System.out.println("Shapes read from the file: \n");
            for (Shape3D shape : shapes) {
                System.out.println(shape);
            }
        }

        String compareType = args[3];

        Comparator<Shape3D> comparator = "v".equals(compareType) ? new VolumeComparator() : new BaseAreaComparator();

        String sortAlgo = switch(args[5]) {
            case "m" -> "Merge";
            case "q" -> "Quick";
            case "s" -> "Selection";
            case "b" -> "Bubble";
            case "i" -> "Insertion";
            default -> {
                throw new IllegalArgumentException("Unidentified sort algo");
            }
        };

        System.out.println("\nAfter " + sortAlgo + " sort: \n");

        SortingAlgorithms.MergeSort(shapes, comparator);

        for (Shape3D shape : shapes) {
            System.out.println(shape);
        }
    }

    private static void OutputError() {
        System.out.println("Usage: java ShapeApp -f <filename> -t <CompareType>  -s <SortingAlgorithm>");
        System.exit(1);
    }
}