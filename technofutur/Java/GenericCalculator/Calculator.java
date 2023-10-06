package technofutur.Java.GenericCalculator;

public class Calculator <T extends Number> {
    public Calculator(T nbr1, T nbr2) {
        this.nbr1 = nbr1;
        this.nbr2 = nbr2;
    }

    private T nbr1;
    private T nbr2;

    // Addition
    public T add() throws IllegalAccessException {
        if (nbr1 instanceof Integer) {
            return (T) (Integer) (nbr1.intValue() + nbr2.intValue());
        } else if (nbr1 instanceof Double) {
            return (T) (Double) (nbr1.doubleValue() + nbr2.doubleValue());
        } else if (nbr1 instanceof Float) {
            return (T) (Float) (nbr1.floatValue() + nbr2.floatValue());
        } else if (nbr1 instanceof Long) {
            return (T) (Long) (nbr1.longValue() + nbr2.longValue());
        } else {
            throw  new IllegalAccessException("Illegal add");
        }
    }

    // Multiplication
    public T mult() throws IllegalAccessException {
        if (nbr1 instanceof Integer) {
            return (T) (Integer) (nbr1.intValue() * nbr2.intValue());
        } else if (nbr1 instanceof Double) {
            return (T) (Double) (nbr1.doubleValue() * nbr2.doubleValue());
        } else if (nbr1 instanceof Float) {
            return (T) (Float) (nbr1.floatValue() * nbr2.floatValue());
        } else if (nbr1 instanceof Long) {
            return (T) (Long) (nbr1.longValue() * nbr2.longValue());
        } else {
            throw  new IllegalAccessException("Illegal mult");
        }
    }

    // Soustraction
    public T sous() throws IllegalAccessException {
        if (nbr1 instanceof Integer) {
            return (T) (Integer) (nbr1.intValue() - nbr2.intValue());
        } else if (nbr1 instanceof Double) {
            return (T) (Double) (nbr1.doubleValue() - nbr2.doubleValue());
        } else if (nbr1 instanceof Float) {
            return (T) (Float) (nbr1.floatValue() - nbr2.floatValue());
        } else if (nbr1 instanceof Long) {
            return (T) (Long) (nbr1.longValue() - nbr2.longValue());
        } else {
            throw  new IllegalAccessException("Illegal sous");
        }
    }

    // Division
    public T div() throws IllegalAccessException {

        if (nbr1 instanceof Integer && nbr2.intValue() != 0) {
            return (T) (Integer) (nbr1.intValue() / nbr2.intValue());
        } else if (nbr1 instanceof Double && nbr2.doubleValue() != 0) {
            return (T) (Double) (nbr1.doubleValue() / nbr2.doubleValue());
        } else if (nbr1 instanceof Float && nbr2.floatValue() != 0) {
            return (T) (Float) (nbr1.floatValue() / nbr2.floatValue());
        } else if (nbr1 instanceof Long && nbr2.longValue() != 0) {
            return (T) (Long) (nbr1.longValue() / nbr2.longValue());
        } else {
            throw  new IllegalAccessException("Illegal div");
        }
    }

}
