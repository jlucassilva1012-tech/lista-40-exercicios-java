import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int n = sc.nextInt();

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int maior = numero;
        int menor = numero;

        for (int i = 2; i <= n; i++) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
