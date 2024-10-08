package utilities;

import shapes.*;

import java.io.*;
import java.util.Scanner;

public class ShapesFileReader {
    public static Shape3D[] readShapesFromFile(String fileName) {
        Shape3D[] shapes = null;

        try (Scanner scanner = new Scanner(new File(fileName))) {
            // First value in the file is the number of shapes.
            int numberOfShapes = scanner.nextInt();
            shapes = new Shape3D[numberOfShapes];

            // Read each shape and its properties.
            for (int i = 0; i < numberOfShapes; i++) {
                String shapeType = scanner.next();
                double height = scanner.nextDouble();

                switch (shapeType) {
                    case "Cylinder":
                        double radiusCylinder = scanner.nextDouble();
                        shapes[i] = new Cylinder(height, radiusCylinder);
                        break;
                    case "Cone":
                        double radiusCone = scanner.nextDouble();
                        shapes[i] = new Cone(height, radiusCone);
                        break;
                    case "Pyramid":
                        double edgeLengthPyramid = scanner.nextDouble();
                        shapes[i] = new Pyramid(height, edgeLengthPyramid);
                        break;
                    case "SquarePrism":
                        double edgeLengthSquarePrism = scanner.nextDouble();
                        shapes[i] = new SquarePrism(height, edgeLengthSquarePrism);
                        break;
                    case "TriangularPrism":
                        double edgeLengthTriangularPrism = scanner.nextDouble();
                        shapes[i] = new TriangularPrism(height, edgeLengthTriangularPrism);
                        break;
                    case "PentagonalPrism":
                        double edgeLengthPentagonalPrism = scanner.nextDouble();
                        shapes[i] = new PentagonalPrism(height, edgeLengthPentagonalPrism);
                        break;
                    case "OctagonalPrism":
                        double edgeLengthOctagonalPrism = scanner.nextDouble();
                        shapes[i] = new OctagonalPrism(height, edgeLengthOctagonalPrism);
                        break;
                    default:
                        System.out.println("Unknown shape type: " + shapeType);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return shapes;
    }
}
