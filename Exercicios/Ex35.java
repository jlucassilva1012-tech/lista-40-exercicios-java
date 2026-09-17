import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        int maior;

        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }

        int mmc = maior;

        while (mmc % a != 0 || mmc % b != 0) {
            mmc++;
        }

        System.out.println("MMC: " + mmc);
    }
}
