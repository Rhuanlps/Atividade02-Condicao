import java.util.Scanner;

public class CalculoDeDescontoProgressivo {

    public static void main(String[] args) {

            double valorTotal = 0;
            double desconto = 0d;

            Scanner scaner = new Scanner(System.in);
            System.out.println("Insira o valor total da compra: ");
            valorTotal = scaner.nextDouble();

            if(valorTotal > 500){
                desconto = valorTotal * 0.20;
            }else if(valorTotal >= 200 && valorTotal <= 500){
                desconto = valorTotal * 0.10;
            }else if(valorTotal >= 100 && valorTotal < 200 ){
                desconto = valorTotal * 0.05;
            }else if(valorTotal < 100){
            }

            System.out.println("Valor total é: " + valorTotal);
            System.out.println("O valor descontado é de: " + desconto);
            System.out.println("Total a pagar é: " + (valorTotal - desconto) );

            scaner.close();
    }

}
