package homework3.task1.ThreeDShapes;

import homework3.task1.AbstractClases.SpaceShape;
import homework3.task1.Vertexes.Vertex3D;

public class Sphere extends SpaceShape {
    public Sphere (Vertex3D v1, double r)
    {
        arrayOfVertexes3D = new Vertex3D[1];
        arrayOfVertexes3D[0] = v1;
        volume = getVolume(r);
        area = getArea(r);
    }

    public  void  displayInfo(){
        System.out.println("Shape: Sphere" + ", vertex: " + arrayOfVertexes3D[0].x + " " + arrayOfVertexes3D[0].y + " " + arrayOfVertexes3D[0].z +
                ", Volume: " + volume + ", Area: " + area);
    }

    public double getArea(double r){
        double area;
        area = 4*Math.PI*Math.pow(r, 2);
        return area;
    }

    public double getVolume(double r) {
        double volume = (4*Math.PI*Math.pow(r, 3))/3;
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

