public class NormalBorderFactory extends DoubleBorderFactory { // Renamed for clarity
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new NormalTriangle(); // Assuming NormalTriangle exists
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new DoubleBorderNormalRectangle();
        }
        throw new IllegalArgumentException("Invalid shape type");
    }
}