package homework3.task1.AbstractClases;

import homework3.task1.Interfaces.VolumeMeasurable;
import homework3.task1.Vertexes.Vertex3D;

public abstract class SpaceShape extends Shape implements VolumeMeasurable {
    public Vertex3D[] arrayOfVertexes3D;
    public double volume;
    @Override
    public String toString() {
        return "Shape: " + getClass().getSimpleName() + ", vertex: " + arrayOfVertexes3D[0].x + " " + arrayOfVertexes3D[0].y + " " + arrayOfVertexes3D[0].z +
                ", Volume: " + volume + ", Area: " + area;
    }
}
