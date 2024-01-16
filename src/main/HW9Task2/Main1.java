public class Main1 {
    public static void main(String[] args) {
        SpecInjCalculator specInjCalculator = new SpecInjCalculator();
        System.out.println("3 + 57 = " + specInjCalculator.add(3, 57));
        System.out.println("382 - 324 = " + specInjCalculator.subtract(382, 324));
        System.out.println("46 * 34 = " + specInjCalculator.multiply(46, 34));
        System.out.println("334 / 4 = " + specInjCalculator.divide(334, 4));
        System.out.println("Квадратный корень из 27 = " + specInjCalculator.squareRoot(27));


        ProgrammCalculator programmerCalculator = new ProgrammCalculator();
        System.out.println("10 + 67 = " + programmerCalculator.add(10, 67));
        System.out.println("10 - 67 = " + programmerCalculator.subtract(10, 67));
        System.out.println("10 * 67 = " + programmerCalculator.multiply(10, 67));
        System.out.println("10 / 67 = " + programmerCalculator.divide(10, 67));
        System.out.println("Двоичное представление 167 = " + programmerCalculator.binaryRepresentation(167));
    }
}


