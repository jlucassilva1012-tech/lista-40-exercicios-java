import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (i % 3 != 0) {
                System.out.println(n + " x " + i + " = " + n * i);
            }
        }
    }
}
