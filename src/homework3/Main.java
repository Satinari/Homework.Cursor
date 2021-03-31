package homework3;

import homework3.task1.AbstractClases.Shape;
import homework3.task1.ThreeDShapes.Cuboid;
import homework3.task1.ThreeDShapes.Sphere;
import homework3.task1.ThreeDShapes.SquarePyramid;
import homework3.task1.TwoDShapes.Circle;
import homework3.task1.TwoDShapes.Rectangle;
import homework3.task1.TwoDShapes.Triangle;
import homework3.task1.Vertexes.Vertex;
import homework3.task1.Vertexes.Vertex3D;

public class Main {

    public static void main(String[] args) {

        //TASK 1
        
        Shape[] array = new Shape[6];
        array[0] = new Triangle(new Vertex(10.0, 11.0), new Vertex(12.0, 13.0), new Vertex(14.0, 25.0));
        array[1] = new Circle(new Vertex(1.0, 1.0), 5);
        array[2] = new Rectangle(new Vertex(2.0, 2.0), 10, 5);
        array[3] = new Sphere(new Vertex3D(3.0, 3.0, 3.0), 5);
        array[4] = new Cuboid(new Vertex3D(5.0, 5.0, 5.0), 10, 5, 5);
        array[5] = new SquarePyramid(new Vertex3D(1.0, 1.0, 1.0), 5, 6);

        for (int i = 0; i < array.length; i++) {
            array[i].displayInfo();
        }

    }
}
