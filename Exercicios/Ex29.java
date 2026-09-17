public class Ex29 {
    public static void main(String[] args) {

        for (int ano = 2000; ano <= 2030; ano++) {
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                System.out.println(ano);
            }
        }
    }
}
