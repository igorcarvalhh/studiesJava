import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double metrosQuadrados, preco, litros;
        int latasTinta = 0;
        int galoesTinta = 0;
        preco = 0;

        System.out.format("Área a ser pintada (m^2): ");
        metrosQuadrados = input.nextDouble();

        litros = metrosQuadrados / 3;

        while (18 * latasTinta < litros) {
            latasTinta++;
        }

        latasTinta--;
        litros = litros - 18 * latasTinta;

        while (3.6 * galoesTinta < litros) {
            galoesTinta++;
        }

        preco = latasTinta * 80 + galoesTinta * 25;

        System.out.format("Você vai precisar de %d latas e %d galões de tinta%n", latasTinta, galoesTinta);
        System.out.format("Valor a ser pago: R$ %.2f", preco);

        input.close();
    }
}