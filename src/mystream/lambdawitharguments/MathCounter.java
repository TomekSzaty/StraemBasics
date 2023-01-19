package mystream.lambdawitharguments;

public class MathCounter {

    public void mathExecute(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.mathExecutor(a, b);
        System.out.println("Result execution = " + result);
    }
}
