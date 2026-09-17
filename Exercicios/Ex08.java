public class Ex08 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.print(a);

            if (a % 2 == 0) {
                System.out.println(" - Par");
            } else {
                System.out.println(" - Ímpar");
            }

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
