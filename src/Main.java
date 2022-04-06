public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        // при делении b=0, поэтому возникает ArithmeticException: / by zero
        // необходимо изменить реализацию "divide"
        calc.println.accept(c);
    }
}
