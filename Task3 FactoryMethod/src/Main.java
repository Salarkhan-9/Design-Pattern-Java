import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Task # 3 ! ===");

            ArrayList<Shape> shapes = new ArrayList<Shape>();

            SingleShapeFactory FactoryShape = new SingleShapeFactory();

            shapes.add(FactoryShape.createShape("Triangle"));
            shapes.add(FactoryShape.createShape("Circle"));
            shapes.add(FactoryShape.createShape("Square"));

            for(Shape s:shapes){
                s.draw();
            }
        }

    }

