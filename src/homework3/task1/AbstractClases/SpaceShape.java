package homework3.task1.AbstractClases;

import homework3.task1.Interfaces.VolumeMeasurable;
import homework3.task1.Vertexes.Vertex3D;

public abstract class SpaceShape extends Shape implements VolumeMeasurable {
    public Vertex3D[] arrayOfVertexes3D;
    public double volume;
}
