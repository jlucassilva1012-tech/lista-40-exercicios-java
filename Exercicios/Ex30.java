import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        double a, b;

        do {
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Primeiro número: ");
                a = sc.nextDouble();

                System.out.print("Segundo número: ");
                b = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println(a + b);
                        break;
                    case 2:
                        System.out.println(a - b);
                        break;
                    case 3:
                        System.out.println(a * b);
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Não pode dividir por zero!");
                        } else {
                            System.out.println(a / b);
                        }
                        break;
                }
            }

        } while (opcao != 5);
    }
}
