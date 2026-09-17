import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        System.out.println("MDC: " + a);
    }
}
