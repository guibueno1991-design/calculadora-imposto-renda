import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE SALÁRIO LÍQUIDO ===");
        System.out.print("Digite o seu salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        double porcentagem = 0;
        double imposto = 0;

        // A mágica das faixas de imposto (Condicionais Encadeadas)
        if (salarioBruto <= 2500.00) {
            porcentagem = 0; // Quem ganha até 2500 não paga imposto (Isento)
        } else if (salarioBruto <= 5000.00) {
            porcentagem = 15; // Quem ganha até 5000 paga 15%
        } else {
            porcentagem = 27; // Quem ganha acima de 5000 paga 27%
        }

        // Calculando o valor do imposto e o salário final
        imposto = (salarioBruto * porcentagem) / 100;
        double salarioLiquido = salarioBruto - imposto;

        System.out.println("\n--- DETALHES DO DESCONTO ---");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Imposto Descontado (" + porcentagem + "%): R$ " + imposto);
        System.out.println("Salário Líquido (O que vai pro bolso): R$ " + salarioLiquido);

        scanner.close();
    }
}