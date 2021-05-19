import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.printf("Temperatura em fahrenheit: ");
        celsius = input.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("temperatura em graus Celsius: %.2f °F", fahrenheit);
        
        input.close();
    }
}
