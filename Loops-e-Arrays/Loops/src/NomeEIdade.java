import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        String nome = null;
        int idade;

        while (nome != "0") {

            System.out.println("Digite seu nome: ");
            nome = scan.nextLine();
            if (nome.equals("0")) {
                break;
                
            }

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            System.out.println("Nome: " + nome + " Idade: " + idade);

            scan.nextLine(); // Limpa o buffer do scanner
        }

        

        System.out.println("Continua aqui...");

    }

    
    }

