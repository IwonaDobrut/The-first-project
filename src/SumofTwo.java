import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");
        a = scanner.nextInt();
        System.out.println("Input second number");
        b = scanner.nextInt();

        System.out.println("Sum of: a + b = " + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println("Product of: a + b = " + (a*b));
        System.out.println("Quotient of: a/b = " +(a/b));


    }
}
