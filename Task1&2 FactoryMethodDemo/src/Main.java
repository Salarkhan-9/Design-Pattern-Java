import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task # 1 Run the Example !");
        System.out.println("Task # 2 Add Triangle Geometry And Run it");

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        CircleGeometry circleGeometry = new CircleGeometry();
        SquareGeometry squareGeometry = new SquareGeometry();
        //Created Object of Triangle
        TriangleGeometry triangle=new TriangleGeometry();

        //Other
        shapes.add(circleGeometry.createShape());
        shapes.add(squareGeometry.createShape());
        shapes.add(squareGeometry.createShape());


        //Triangle
        shapes.add(triangle.createShape());

        for(Shape s:shapes){
            s.draw();
        }
    }
}