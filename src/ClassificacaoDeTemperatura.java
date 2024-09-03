import java.util.Scanner;

public class ClassificacaoDeTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite temperatura em Celsius: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 30) {
            System.out.println("Quente");
        } else if (temperatura >= 15 && temperatura <= 30) {
            System.out.println("Agradável");
        } else {
            System.out.println("Frio");
        }

        scanner.close();
    }

}