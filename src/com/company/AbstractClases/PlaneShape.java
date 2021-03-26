package com.company.AbstractClases;

import com.company.Interfaces.PerimeterMeasurable;
import com.company.Vertexes.Vertex;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable {
    public Vertex[] arrayOfVertexes;
    public double perimeter;
}
