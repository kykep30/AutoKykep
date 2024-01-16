public class SpecInjCalculator extends InjCalculator {
    public double squareRoot(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            System.out.println("Error: Cannot calculate square root of a negative number");
            return Double.NaN;
        }
    }
}


