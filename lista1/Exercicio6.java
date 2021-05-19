import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float raio, area;

        System.out.printf("Valor do raio: ");

        raio = input.nextFloat();

        area = (float) (Math.PI) * raio * raio;

        System.out.printf("A área da circunferencia é %.2f", area);

        input.close();
    }
}
