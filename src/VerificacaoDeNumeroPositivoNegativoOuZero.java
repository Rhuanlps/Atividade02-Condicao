import java.util.Scanner;

public class VerificacaoDeNumeroPositivoNegativoOuZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo, negativo ou zero: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

        scanner.close();
    }
}