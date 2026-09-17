import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Número negativo!");
        } else {
            int fatorial = 1;

            for (int i = 1; i <= n; i++) {
                fatorial = fatorial * i;
            }

            System.out.println("Fatorial: " + fatorial);
        }
    }
}
