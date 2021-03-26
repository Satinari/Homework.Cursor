package com.company.Vertexes;

public class Vertex {
    public double x, y;

    public Vertex(double x, double y){
        this.x = x;
        this.y = y;
    }

    public  double getDistance(Vertex v){
        return Math.sqrt(Math.pow(this.x - v.x, 2)+ Math.pow(this.y - v.y, 2));
    }
}
