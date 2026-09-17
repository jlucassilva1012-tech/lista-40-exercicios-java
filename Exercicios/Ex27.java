import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = 7;
        int chute;

        do {
            System.out.print("Digite seu chute: ");
            chute = sc.nextInt();

            if (chute > secreto) {
                System.out.println("O número é menor.");
            } else if (chute < secreto) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("Acertou!");
            }

        } while (chute != secreto);
    }
}
