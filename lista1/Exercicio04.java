import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, media;
        Scanner input = new Scanner(System.in); 

        System.out.printf("Digite a nota 1: ");
        nota1 = input.nextFloat();
        System.out.printf("Digite a nota 2: ");
        nota2 = input.nextFloat();
        System.out.printf("Digite a nota 3: ");
        nota3 = input.nextFloat();
        System.out.printf("Digite a nota 4: ");
        nota4 = input.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Sua média foi %.2f", media);

        input.close();
    }
}
