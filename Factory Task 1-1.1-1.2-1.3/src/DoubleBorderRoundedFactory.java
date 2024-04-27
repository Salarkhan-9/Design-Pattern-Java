

public class DoubleBorderRoundedFactory extends DoubleBorderFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new DoubleBorderRoundedTriangle(); // Add this class if needed
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new DoubleBorderRoundedRectangle();
        }
        throw new IllegalArgumentException("Invalid shape type");
    }
}
