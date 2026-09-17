import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int soma = 0;

        while (numero != 0) {
            soma = soma + numero % 10;
            numero = numero / 10;
        }

        System.out.println("Soma: " + soma);
    }
}
