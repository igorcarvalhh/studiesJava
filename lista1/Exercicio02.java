import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Escolha um número: ");
        int num = input.nextInt();
        System.out.println("O número informado foi " + num);
        input.close();
    }
}
