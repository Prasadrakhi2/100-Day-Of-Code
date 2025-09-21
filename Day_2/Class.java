class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class Class {
    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);
        System.out.println(result);
    }

}