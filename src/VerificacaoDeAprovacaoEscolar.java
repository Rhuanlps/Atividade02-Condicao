import java.util.Scanner;
public class VerificacaoDeAprovacaoEscolar {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a média final do aluno: ");
                double mediaFinal = scanner.nextDouble();

                if (mediaFinal >= 7) {
                    System.out.println("Aprovado");
                } else if (mediaFinal >= 5 && mediaFinal < 7) {
                    System.out.println("Recuperação");
                } else {
                    System.out.println("Reprovado");
                }

                scanner.close();
    }

}
