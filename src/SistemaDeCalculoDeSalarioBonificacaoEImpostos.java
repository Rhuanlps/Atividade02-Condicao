import java.util.Scanner;

public class SistemaDeCalculoDeSalarioBonificacaoEImpostos {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o salário bruto do funcionário: R$ ");
            double salarioBruto = scanner.nextDouble();

            System.out.print("Digite o número de anos de trabalho do funcionário: ");
            int anosTrabalho = scanner.nextInt();

            double bonus = 0.0;
            if (anosTrabalho > 10) {
                bonus = salarioBruto * 0.10;
            } else if (anosTrabalho >= 5) {
                bonus = salarioBruto * 0.05;
            }

            double imposto;
            if (salarioBruto > 5000) {
                imposto = salarioBruto * 0.27;
            } else if (salarioBruto >= 3000) {
                imposto = salarioBruto * 0.18;
            } else {
                imposto = salarioBruto * 0.10;
            }

            double salarioLiquido = salarioBruto + bonus - imposto;

            // 6. Exibir os resultados
            System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
            System.out.printf("Bônus Recebido: R$ %.2f\n", bonus);
            System.out.printf("Imposto Descontado: R$ %.2f\n", imposto);
            System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);

            scanner.close();
        }
    }

