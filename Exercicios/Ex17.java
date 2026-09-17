import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int quantidade = 0;

        if (numero == 0) {
            quantidade = 1;
        }

        while (numero != 0) {
            numero = numero / 10;
            quantidade++;
        }

        System.out.println("Quantidade de dígitos: " + quantidade);
    }
}
