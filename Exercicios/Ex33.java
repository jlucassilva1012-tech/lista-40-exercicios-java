public class Ex33 {
    public static void main(String[] args) {

        for (int celsius = 0; celsius <= 100; celsius++) {
            double fahrenheit = celsius * 9.0 / 5 + 32;

            if (celsius == 0) {
                System.out.println(celsius + "°C = " + fahrenheit + "°F - Congelamento");
            } else if (celsius == 100) {
                System.out.println(celsius + "°C = " + fahrenheit + "°F - Ebulição");
            } else {
                System.out.println(celsius + "°C = " + fahrenheit + "°F");
            }
        }
    }
}
