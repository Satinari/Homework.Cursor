package homework2;

public class Circle {
    public double area(int radius) {
        double areaOfCircle = Math.PI*(radius * radius);
        System.out.println("Area of a circle with a radius "+ radius + " is - " + areaOfCircle);
        return areaOfCircle;
    }
}
