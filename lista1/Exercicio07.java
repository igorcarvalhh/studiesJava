import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float ladoQuadrado, areaQuadrado;

        System.out.printf("Valor do lado do quadrado: ");
        ladoQuadrado = input.nextFloat();

        areaQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.printf("O dobro da área desse quadrado é %.2f", 2 * areaQuadrado);
        input.close();
    }
}
