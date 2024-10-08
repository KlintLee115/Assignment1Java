package appDomain;

import shapes.Shape3D;
import utilities.ShapesFileReader;

public class AppDriver
{

    public static void main( String[] args )
    {
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
        if (args.length == 2 && args[0].equals("-f")) {
            String fileName = args[1];

            // Read shapes from the file
            Shape3D[] shapes = ShapesFileReader.readShapesFromFile(fileName);

            // Print all shapes
            if (shapes != null) {
                System.out.println("Shapes read from the file:");
                for (Shape3D shape : shapes) {
                    System.out.println(shape);
                }
            }
        } else {
            System.out.println("Usage: java ShapeApp -f <filename>");
        }
    }

}
