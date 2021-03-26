package com.company.TwoDShapes;

import com.company.AbstractClases.PlaneShape;
import com.company.Vertexes.Vertex;

public class Triangle extends PlaneShape {
    public Triangle(Vertex v1, Vertex v2, Vertex v3){
        System.out.println(v1);

        arrayOfVertexes = new Vertex[3];
        arrayOfVertexes[0] = v1;
        arrayOfVertexes[1] = v2;
        arrayOfVertexes[2] = v3;

        double a = v1.getDistance(v2);
        double b = v2.getDistance(v3);
        double c = v3.getDistance(v1);
        perimeter = getPerimeter(a, b, c);
        area = getArea(a, b, c);

    }

    public  void  displayInfo(){
        System.out.println("Shape: Triangle" + ", vertex 1: " + arrayOfVertexes[0].x + " " + arrayOfVertexes[0].y +
                ", vertex 2: " + arrayOfVertexes[1].x + " " + arrayOfVertexes[1].y +
                ", vertex 3: " + arrayOfVertexes[2].x + " " + arrayOfVertexes[2].y +
                ", Perimeter: " + perimeter + ", Area: " + area);
    }

    public double getPerimeter(double a, double b, double c){
        double sum = a+b+c;
        return sum;
    }

    public double getArea(double a, double b, double c){
        double p = (a+b+c)/2.0;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    @Override
    public double getPerimeter() { return perimeter; }

    @Override
    public double getArea() {
        return area;
    }
}
