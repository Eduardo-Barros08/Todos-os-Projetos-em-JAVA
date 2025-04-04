package poo;

import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {
        Numero n = new Numero();

        boolean continuar = true;
        
        Scanner scan = new Scanner (System.in);
        while(continuar){
         double x = 0;
         double y = 0;
         int operacao = 0;
         
         System.out.println("Digite a operação desejada: "
         + "\n1-Soma"
         + "\n2-Subtração"
         + "\n3-Multiplicação"
         + "\n4-Divisão"
         + "\n0-Sair"
         );
        
        operacao = scan.nextInt();

        if(operacao == 0){
            continuar = false;
            return;
         }

         System.out.println("Informe o valor do primeiro número: ");
         x = scan.nextDouble();

         System.out.println("Informe o valor do segundo número: ");
         y = scan.nextDouble();

        switch (operacao) {
            case 1:
                ImprimeCalculadora(operacao, n.soma(x, y), x, y);
                break;
            case 2:
                ImprimeCalculadora(operacao, n.subtracao(x, y), x, y);
                break;
            case 3:
                ImprimeCalculadora(operacao, n.multiplicacao(x, y), x, y);
                break;
            case 4:
                ImprimeCalculadora(operacao, n.divisao(x, y), x, y);
                break;
        
        }

        } 
        
        scan.close();   
    }

        static void ImprimeCalculadora(int operacao, double resultado, double x, double y){
         HashMap <Integer, String> mapOperacao = new HashMap<>();
         mapOperacao.put( 1, " Somado ");
         mapOperacao.put(2, " Subtraido ");
         mapOperacao.put(3," Multiplicado ");
         mapOperacao.put(4," Dividido ");

         System.out.println("O resultado de " + x + mapOperacao.get(operacao) + "por" + y + " é: " + resultado);


        }
}
