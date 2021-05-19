import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tamanho, velocidade, tempo;

        System.out.format("Tamanho do arquivo (MB): ");
        tamanho = input.nextDouble();
        System.out.format("Velocidade da internet (Mbps): ");
        velocidade = input.nextDouble();

        tempo = ((8 * tamanho) / velocidade) / 60;
        
        System.out.format("Tempo de download: %.2f min", tempo);

        input.close();
    }
}