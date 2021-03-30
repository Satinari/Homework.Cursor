package homework3.task1.AbstractClases;

import homework3.task1.Interfaces.PerimeterMeasurable;
import homework3.task1.Vertexes.Vertex;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable {
    public Vertex[] arrayOfVertexes;
    public double perimeter;
}
