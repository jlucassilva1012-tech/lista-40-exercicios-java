import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int original = numero;
        int temp = numero;
        int digitos = 0;

        while (temp != 0) {
            digitos++;
            temp = temp / 10;
        }

        int soma = 0;

        for (int i = numero; i > 0; i = i / 10) {
            int digito = i % 10;
            int potencia = 1;

            for (int j = 1; j <= digitos; j++) {
                potencia = potencia * digito;
            }

            soma = soma + potencia;
        }

        if (soma == original) {
            System.out.println("É Armstrong");
        } else {
            System.out.println("Não é Armstrong");
        }
    }
}
