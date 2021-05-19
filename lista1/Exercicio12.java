import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double altura, peso;

        System.out.printf("Digite sua altura (m): ");
        altura = input.nextDouble();

        peso = (72.7 * altura) - 58;

        System.out.printf("Seu peso ideal é %.2f kg", peso);
        
        input.close();
    }
}
