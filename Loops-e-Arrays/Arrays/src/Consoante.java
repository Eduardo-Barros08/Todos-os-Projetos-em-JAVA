import java.util.Scanner;

public class Consoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String [6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do{
            System.out.println("Letra: ");
            String Letra = scan.next();
            
            if(!(Letra.equalsIgnoreCase("a")| 
               Letra.equalsIgnoreCase("e")|
               Letra.equalsIgnoreCase("i")|
               Letra.equalsIgnoreCase("o")|
               Letra.equalsIgnoreCase("u")) ){
                consoantes[count] = Letra;
                quantidadeConsoantes++;
               }
               count++;
        } while(count < consoantes.length);

        scan.close();
        
        System.out.println("Consoantes: ");
                for(String consoante : consoantes){
                    if(consoante != null)
                    System.out.print(consoante + " ");
                }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);
    } 
    
}
