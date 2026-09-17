import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000;
        double saque;
        int opcao;

        do {
            System.out.print("Digite o valor do saque: ");
            saque = sc.nextDouble();

            if (saque <= saldo) {
                saldo = saldo - saque;
                System.out.println("Saque realizado!");
            } else {
                System.out.println("Saldo insuficiente!");
            }

            System.out.println("Saldo: " + saldo);
            System.out.print("Digite 1 para continuar ou 0 para sair: ");
            opcao = sc.nextInt();

        } while (opcao != 0);
    }
}
