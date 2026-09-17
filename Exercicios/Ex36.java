import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anterior = 0;
        boolean crescente = true;
        boolean primeiro = true;

        while (true) {
            System.out.print("Digite um número (-1 para parar): ");
            int numero = sc.nextInt();

            if (numero == -1) {
                break;
            }

            if (!primeiro) {
                if (numero <= anterior) {
                    crescente = false;
                }
            }

            anterior = numero;
            primeiro = false;
        }

        if (crescente) {
            System.out.println("A sequência é crescente.");
        } else {
            System.out.println("A sequência não é crescente.");
        }
    }
}
