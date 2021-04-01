package homework3.task1.TwoDShapes;

import homework3.task1.AbstractClases.PlaneShape;
import homework3.task1.Vertexes.Vertex;

public class Circle extends PlaneShape {
    public Circle (Vertex v1, double r)
    {
        arrayOfVertexes = new Vertex[1];
        arrayOfVertexes[0] = v1;
        perimeter = getPerimeter(r);
        area = getArea(r);
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
