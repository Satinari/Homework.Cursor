package homework3.task1.TwoDShapes;

import homework3.task1.AbstractClases.PlaneShape;
import homework3.task1.Vertexes.Vertex;

public class Rectangle extends PlaneShape {
    public Rectangle(Vertex v1, int width, int height){
        arrayOfVertexes = new Vertex[1];
        arrayOfVertexes[0] = v1;
        perimeter = getPerimeter(width,height);
        area = getArea(width,height);

    }

    public double getPerimeter(int width, int height){
        double sum = (width + height)*2;
        return sum;
    }

    public double getArea(int width, int height){
        double area = width * height;
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }
}
