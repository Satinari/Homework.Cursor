package com.company.TwoDShapes;

import com.company.AbstractClases.PlaneShape;
import com.company.Vertexes.Vertex;

public class Circle extends PlaneShape {
    public Circle (Vertex v1, double r)
    {
        arrayOfVertexes = new Vertex[1];
        arrayOfVertexes[0] = v1;
        perimeter = getPerimeter(r);
        area = getArea(r);
    }

    public  void  displayInfo(){
        System.out.println("Shape: Circle" + ", vertex: " + arrayOfVertexes[0].x + " " + arrayOfVertexes[0].y +
                ", Perimeter: " + perimeter + ", Area: " + area);
    }

    public double getArea(double r){
        double area;
        area = Math.PI*Math.pow(r, 2);
        return area;
    }

    public double getPerimeter(double r) {
        double circumference = 2*Math.PI*r;
        return circumference;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }
}
