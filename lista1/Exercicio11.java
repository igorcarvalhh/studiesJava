import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inteiro1, inteiro2;
        float real;

        inteiro1 = input.nextInt();
        inteiro2 = input.nextInt();
        real = input.nextFloat();

        System.out.println(inteiro1 * inteiro2);
        System.out.println(3 * inteiro1 + real);
        System.out.println(Math.pow(real,3));
        
        input.close();
    }
}
