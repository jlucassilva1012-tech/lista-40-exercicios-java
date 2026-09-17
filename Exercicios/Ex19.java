import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int invertido = 0;

        while (numero != 0) {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero = numero / 10;
        }

        System.out.println("Invertido: " + invertido);
    }
}
