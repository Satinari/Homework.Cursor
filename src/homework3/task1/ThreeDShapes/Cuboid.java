package homework3.task1.ThreeDShapes;

import homework3.task1.AbstractClases.SpaceShape;
import homework3.task1.Vertexes.Vertex3D;

public class Cuboid extends SpaceShape {
    public Cuboid (Vertex3D v1, double width, double height, double depth)
    {
        arrayOfVertexes3D = new Vertex3D[1];
        arrayOfVertexes3D[0] = v1;
        volume = getVolume(width, height, depth);
        area = getArea(width, height, depth);
    }

    public  void  displayInfo(){
        System.out.println("Shape: Cuboid" + ", vertex: " + arrayOfVertexes3D[0].x + " " + arrayOfVertexes3D[0].y + " " + arrayOfVertexes3D[0].z +
                ", Volume: " + volume + ", Area: " + area);
    }

    public double getArea(double width, double height, double depth){
        double area;
        area = (width + height + depth)*2;
        return area;
    }

    public double getVolume(double width, double height, double depth) {
        double volume = width * height * depth;
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
