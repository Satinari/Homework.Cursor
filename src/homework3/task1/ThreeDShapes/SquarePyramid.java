package homework3.task1.ThreeDShapes;

import homework3.task1.AbstractClases.SpaceShape;
import homework3.task1.Vertexes.Vertex3D;

public class SquarePyramid extends SpaceShape {
    public SquarePyramid (Vertex3D vertexOne, double width, double height)
    {
        arrayOfVertexes3D = new Vertex3D[1];
        arrayOfVertexes3D[0] = vertexOne;
        double s = ((width/2)*(width/2)) + (height * height);
        volume = getVolume(width, height);
        area = getArea(width, height, s);
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
