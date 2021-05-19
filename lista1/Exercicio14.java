import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, excesso, multa;
        excesso = 0;
        multa = 0;
        System.out.printf("Peso de peixes (kg): ");
        peso = input.nextDouble();

        if (peso > 50) {
            excesso = peso - 50;
            multa = 4 * excesso;
        }

        System.out.printf("A multa a ser paga é de R$ %.2f", multa);
        
        input.close();
    }
}
