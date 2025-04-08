import java.util.Scanner;

public class Doces {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qDoces;
        
        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        
        System.out.println("Insira a quantidade de dinheiro: ");
        int dinheiro = leitor.nextInt();
        qDoces = dinheiro * 2;

        System.out.println("O cliente obteve " + qDoces + " doces");

        

    leitor.close();
    }
    
}

