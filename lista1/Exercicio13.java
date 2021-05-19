import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double altura, pesoHomem, pesoMulher;

        System.out.printf("Digite sua altura (m): ");
        altura = input.nextDouble();

        pesoHomem = (72.7 * altura) - 58;
        pesoMulher = (62.1 * altura) - 44.7;

        System.out.printf("Peso ideal para homens %.2f kg\n", pesoHomem);
        System.out.printf("Peso ideal para mulheres %.2f kg", pesoMulher);
        
        input.close();
    }
}