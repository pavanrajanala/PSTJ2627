package Week_Tasks.Week8_Tasks;

import java.util.*;

public class Week8_Task4_JavaVisitorPattern {
    interface Visitor {
        void visit(Circle circle);

        void visit(Square square);
    }

    interface Shape {
        void accept(Visitor visitor);
    }

    static class Circle implements Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    static class Square implements Shape {
        double side;

        Square(double side) {
            this.side = side;
        }

        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    static class AreaVisitor implements Visitor {
        public void visit(Circle circle) {
            double area = Math.PI * circle.radius * circle.radius;
            System.out.printf("Circle area: %.2f%n", area);
        }

        public void visit(Square square) {
            double area = square.side * square.side;
            System.out.printf("Square area: %.2f%n", area);
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(3), new Square(4));
        Visitor areaVisitor = new AreaVisitor();

        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
        }
    }
}
