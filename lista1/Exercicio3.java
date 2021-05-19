import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int num1, num2, soma;
        Scanner input = new Scanner(System.in);

        System.out.printf("Escolha o primeiro número: ");
        num1 = input.nextInt();
        System.out.printf("Escolha o segundo número: ");
        num2 = input.nextInt();
        
        soma = num1 + num2;

        System.out.println("A soma dos números é " + soma);

        input.close();
    }
}
