package ua.zp.brainacad.PaYwM;

/**
 * Base class for test busyness logic of app.
 */
public class Main {

    public static void main(String[] args) {

        int a = 4;
        int b = 4;

        System.out.println("Create instance of IntegralCalculator");
        IntegralCalculator calculator = new IntegralCalculator();

        System.out.println("Create instance of BooleanCalculator");
        BooleanCalculator booleanCalculator = new BooleanCalculator();

        System.out.println("Create instance of DoubleCalculator");
        DoubleCalculator doubleCalculator = new DoubleCalculator();


        System.out.println("\nTry calc int sum:");
        int sum = calculator.sum(a, b);
        ResultPrinter.print(a, "+", b, sum);
        System.out.println('\n');

        System.out.println("Try calc int sub:");
        int sub = calculator.sub(a, b);
        ResultPrinter.print(a, "-", b, sub);
        System.out.println('\n');

        System.out.println("Try calc int div");
        int div = calculator.div(a, b);
        ResultPrinter.print(a,"/",b,div);
        System.out.println("\n");

        a = 32;
        b = 2;
        System.out.println("Try calc div <<:");
        ResultPrinter.printBinary(a,"<<", b, booleanCalculator.shiftLeft(a, b));
        booleanCalculator.shiftLeft(a, b);
        System.out.println('\n');

        a = 5 ;
        b = 8;
        System.out.println("Try calc div >>:");
        ResultPrinter.printBinary(a,">>", b, booleanCalculator.shiftRight(a, b));
        booleanCalculator.shiftRight(a, b);
        System.out.println('\n');

        //TODO call inverse
    }
}
