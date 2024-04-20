public class SingleShapeFactory {
    public Shape createShape(String shapeType) {
        String lowerCaseShape = shapeType.toLowerCase();

        if ("circle".equals(lowerCaseShape)) {
            return new Circle();
        } else if ("square".equals(lowerCaseShape)) {
            return new Square();
        } else if ("triangle".equals(lowerCaseShape)) {
            return new Triangle();
        } else {
            System.out.println("Invalid Shape");
            return null;
        }
    }
}

