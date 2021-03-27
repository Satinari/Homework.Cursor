package com.company.ThreeDShapes;

import com.company.AbstractClases.SpaceShape;
import com.company.Vertexes.Vertex3D;

public class SquarePyramid extends SpaceShape {
    public SquarePyramid (Vertex3D vertexOne, double width, double height)
    {
        arrayOfVertexes3D = new Vertex3D[1];
        arrayOfVertexes3D[0] = vertexOne;
        double s = ((width/2)*(width/2)) + (height * height);
        volume = getVolume(width, height);
        area = getArea(width, height, s);
    }

    public  void  displayInfo(){
        System.out.println("Shape: SquarePyramid" + ", vertex: " + arrayOfVertexes3D[0].x + " " + arrayOfVertexes3D[0].y + " " + arrayOfVertexes3D[0].z +
                ", Volume: " + volume + ", Area: " + area);
    }

    public double getArea(double width, double height, double s){
        double area;
        area = ((2*width*s)+(width*width))*4;
        return area;
    }

    public double getVolume(double width, double height) {
        double volume = ((width*width)*height)/3;
        return volume;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
