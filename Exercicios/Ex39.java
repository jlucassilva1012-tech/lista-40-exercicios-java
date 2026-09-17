import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o limite: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 1; soma <= n; i++) {
            soma = soma + i;

            if (soma <= n) {
                System.out.println(soma);
            }
        }
    }
}
