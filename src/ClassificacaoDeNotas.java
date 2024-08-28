public class ClassificacaoDeNotas {

    public static void main(String[] args) {

        Double nota = 6.0;

        if (nota >= 9 && nota <= 10) {
            System.out.println("Exelente");
        }else if (nota >= 7 && nota < 9) {
            System.out.println("Bom");
        }else if (nota >= 5 && nota < 7) {
            System.out.println("Satisfatório");
        }else if (nota < 5) {
            System.out.println("Insatisfatório");
        }
    }
}
