import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double metrosQuadrados, preco, litros;
        int latasTinta = 0
        ;
        preco = 0;

        System.out.format("Área a ser pintada (m^2): ");
        metrosQuadrados = input.nextDouble();

        litros = metrosQuadrados / 3;

        while (18 * latasTinta < litros) {
            latasTinta++;
        }

        preco = latasTinta * 80;

        System.out.format("Você vai precisar de %d latas de tinta%n", latasTinta);
        System.out.format("Valor a ser pago: R$ %.2f", preco);

        input.close();
    }
}
