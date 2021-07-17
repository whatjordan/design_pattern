package solid;


public class LiskovSubstitutionPrinciple {
    /**
     * Subtypes must be substitutable for their base types.
     */
}

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double width = 3;
    double height = 3;

    public double calculateArea() {
        return width * height;
    }
}

class Circular implements Shape {
    double radius = 2;

    public double calculateArea() {
        return radius * radius * 3.14;
    }
}