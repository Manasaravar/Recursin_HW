import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        Fibonacci(number);
        System.out.println();
        System.out.print("Ряд Фибоначчи: ");
        FibonacciPrint(number);
        System.out.println();
        System.out.println(number + "! = " + Factorial(number));
        System.out.println("Введите степень: ");
        int degree = scanner.nextByte();
        System.out.println("%d^%d = %d".formatted(number,degree,Power(number, degree)));
    }
    static int Fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        }
        return Fibonacci(number - 1) + Fibonacci(number - 2);

    }
    static void FibonacciPrint(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(Fibonacci(i) + "\t");
        }
            return;
        }
    static int Factorial (int fact) {
        return (fact <= 1) ? 1 : fact*Factorial(fact - 1);
    }
    static int Power (int number, int degree) {
        return (degree == 0) ? 1 : number * Power(number, degree - 1);

    }

}