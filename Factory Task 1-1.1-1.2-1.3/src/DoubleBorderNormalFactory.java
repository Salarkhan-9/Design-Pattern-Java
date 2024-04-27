
public class DoubleBorderNormalFactory extends DoubleBorderFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new DoubleBorderNormalTriangle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {  // Existing rectangle handling
            return new DoubleBorderNormalRectangle();
        }
        throw new IllegalArgumentException("Invalid shape type");
    }
}