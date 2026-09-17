import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota: ");
            double nota = sc.nextDouble();

            if (nota >= 7) {
                System.out.println("Aprovado");
            } else if (nota >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
