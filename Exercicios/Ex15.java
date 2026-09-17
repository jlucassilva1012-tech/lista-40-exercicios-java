import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero != 0) {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero = numero / 10;
        }

        if (original == invertido) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}
