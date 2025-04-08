import java.util.Scanner; 
    
public class Download {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        // Exemplo: se o tamanho for 5, deve ser impresso "|||||"
        // Exemplo: se o tamanho for 10, deve ser impresso "||||||||||"
        
        if(tamanho > 0 && tamanho <= 10)
        for(int i = 0; i < tamanho; i++){
            System.out.print("/");
        }
        else if(tamanho > 10){
            System.out.println("Número inválido!");
        }
        leitor.close();
    }
}