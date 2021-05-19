import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.printf("Temperatura em fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = 5 * ((fahrenheit - 32) / 9);

        System.out.printf("temperatura em graus Celsius: %.2f °C", celsius);
        
        input.close();
    }
}

