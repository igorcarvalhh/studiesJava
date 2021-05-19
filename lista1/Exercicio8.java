import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float precoDaHora, quantidadeHoras, salario;

        System.out.printf("Preço da hora: ");
        precoDaHora = input.nextFloat();

        System.out.printf("Horas trabalhadas no mês: ");
        quantidadeHoras = input.nextFloat();

        salario = quantidadeHoras * precoDaHora;

        System.out.printf("Seu salário esse mês é R$ %.2f", salario);
        
        input.close();
    }
}
