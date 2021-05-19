import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precoDaHora, quantidadeHoras, salarioBruto, salarioLiquido, ir, inss, sindicato;

        System.out.printf("Preço da hora: ");
        precoDaHora = input.nextDouble();

        System.out.printf("Horas trabalhadas no mês: ");
        quantidadeHoras = input.nextDouble();

        salarioBruto = quantidadeHoras * precoDaHora;
        ir = 0.11 * salarioBruto;
        inss = 0.08 * salarioBruto;
        sindicato = 0.05 * salarioBruto;
        salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.printf("+ Salário Bruto : R$ %.2f\n", salarioBruto);
        System.out.printf("- IR (11) : R$ %.2f\n", ir);
        System.out.printf("- INSS (8) : R$ %.2f\n", inss);
        System.out.printf("- Sindicato (5) : R$ %.2f\n", sindicato);
        System.out.printf("= Salário Líquido : R$ %.2f\n", salarioLiquido);
        
        input.close();
    }
}
