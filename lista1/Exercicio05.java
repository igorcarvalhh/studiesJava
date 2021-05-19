import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float centimetros, metros;

        System.out.printf("Degite uma medida em m: ");
        metros = input.nextFloat();

        centimetros = metros * 100;

        System.out.printf("Essa medida corresponde a %.2f cm", centimetros);

        input.close();
    }
}
