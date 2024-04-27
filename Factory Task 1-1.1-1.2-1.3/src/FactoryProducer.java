


public class FactoryProducer {
    public static DoubleBorderFactory getFactory(boolean rounded) {
        if (rounded) {
            return new DoubleBorderRoundedFactory();
        } else {
            return new DoubleBorderNormalFactory();
        }
    }
}