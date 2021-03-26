package com.company;

import com.company.AbstractClases.Shape;
import com.company.ThreeDShapes.Cuboid;
import com.company.ThreeDShapes.Sphere;
import com.company.ThreeDShapes.SquarePyramid;
import com.company.TwoDShapes.Circle;
import com.company.TwoDShapes.Rectangle;
import com.company.TwoDShapes.Triangle;
import com.company.Vertexes.Vertex;

public class Main {

    public static void main(String[] args) {
        Shape[] array = new Shape[6];
        array[0] = new Triangle(new Vertex(10.0, 11.0), new Vertex(12.0, 13.0), new Vertex(14.0, 25.0));
        array[1] = new Circle();
        array[2] = new Rectangle();
        array[3] = new Sphere();
        array[4] = new Cuboid();
        array[5] = new SquarePyramid();

        for (int i = 0; i < array.length; i++) {
            array[i].displayInfo();
        }
    }
}
