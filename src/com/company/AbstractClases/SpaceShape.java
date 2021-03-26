package com.company.AbstractClases;

import com.company.Interfaces.VolumeMeasurable;
import com.company.Vertexes.Vertex3D;

public abstract class SpaceShape extends Shape implements VolumeMeasurable {
    public Vertex3D[] arrayOfVertexes3D;
    public double volume;
}
