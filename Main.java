package LambdaExpressions;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int x = -1;
        int y = 1;

        int a = calc.plus.apply(x,y);
        calc.println.accept(a);

        int b = calc.minus.apply(x,y);
        calc.println.accept(b);

        // Ошибкой в данном случае служит то, что деленение на ноль никак не обрабатывается
        // и компилятор просто выбрасывает исключение
        try {
            int c = calc.devide.apply(x, y);
            calc.println.accept(c);
        } catch (Exception e) {
            System.out.println("На ноль делить нельзя");
        }

        int d = calc.multiply.apply(x,y);
        calc.println.accept(d);

        int e = calc.pow.apply(x);
        calc.println.accept(e);

        int f = calc.abs.apply(x);
        calc.println.accept(f);

        boolean g = calc.isPositive.test(x);
        System.out.println(g);

    }
}
