package com.company;

import com.company.AbstractClases.Shape;
import com.company.ThreeDShapes.Cuboid;
import com.company.ThreeDShapes.Sphere;
import com.company.ThreeDShapes.SquarePyramid;
import com.company.TwoDShapes.Circle;
import com.company.TwoDShapes.Rectangle;
import com.company.TwoDShapes.Triangle;
import com.company.Vertexes.Vertex;
import com.company.Vertexes.Vertex3D;

public class Main {

    public static void main(String[] args) {
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
