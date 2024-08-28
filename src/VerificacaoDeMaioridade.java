import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class VerificacaoDeMaioridade {

    public static void main(String[] args) {


        Integer idade = 19;
        if (idade >= 18) {
            System.out.println("Você é maior idade");
        }else if (idade < 17) {
            System.out.println("Você é menor idade");
        }

    }
}
