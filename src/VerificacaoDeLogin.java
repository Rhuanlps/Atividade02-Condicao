import java.sql.SQLOutput;
import java.util.Scanner;

public class VerificacaoDeLogin {

    public static void main(String[] args) {

        String usuario = "Paulo";
        String senha = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do usuário: ");
        String usuarioNome = sc.nextLine();

        System.out.print("Insira o seu senha: ");
        String usuarioSenha = sc.nextLine();

        if (usuario.equals(usuarioNome) && senha.equals(usuarioSenha)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }

        sc.close();
    }
}
