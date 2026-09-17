import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor inicial: ");
        double valor = sc.nextDouble();

        System.out.print("Taxa: ");
        double taxa = sc.nextDouble();

        System.out.print("Limite: ");
        double limite = sc.nextDouble();

        for (int mes = 1; mes <= 12; mes++) {
            valor = valor + (valor * taxa / 100);

            System.out.println("Mês " + mes + ": " + valor);

            if (valor > limite) {
                System.out.println("Ultrapassou o limite!");
            }
        }
    }
}
